package com.osypenko.suppliermonitoringtelegrambot.repositories;

import com.osypenko.suppliermonitoringtelegrambot.entityes.Users;
import com.osypenko.suppliermonitoringtelegrambot.repositories.interfaces.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
@Component
public class UserService {
    private UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //Создание списка всех Пользователей
    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    //Создание map-ы, ключ ето корп номер, значение пользователь под этим номером
    public HashMap<Integer, Users> getUserForCorpId() {
        HashMap<Integer, Users> userMap = new HashMap<>();
        for (Users user : getAllUsers()) {
            userMap.put(user.getCorpId(), user);
        }
        return userMap;
    }

    //Создание set-а со всеми корпоративными номерами
    public Set<Long> getSetListUsersCorpId() {
        Set<Long> userChatId = new HashSet<>();
        for (Users user : getAllUsers()) {
            userChatId.add(user.getAccessTelegramBot());
        }
        return userChatId;
    }

    //Удаление chatID телеграмма в базе что-бы ограничить доступ
    public void userLogOut(long chatId) {
        for (Users user : getAllUsers()) {
            if (user.getAccessTelegramBot().equals(chatId)) {
                user.setAccessTelegramBot(0L);
                updateUser(user);
            }
        }
    }

    //Изменения Пользователя (добавление chatId телеграмма в базу для доступа к данным
    public void updateUser(Users updateUser) {
        userRepository.save(updateUser);
    }
}
