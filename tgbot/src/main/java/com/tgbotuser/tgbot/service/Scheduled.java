package com.tgbotuser.tgbot.service;

import com.tgbotuser.tgbot.entity.NotificationTask;
import com.tgbotuser.tgbot.repository.NotificationTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class Scheduled {

    @Autowired
    NotificationTaskRepository notificationTaskRepository;

        public List<NotificationTask> runTasks() {
        return notificationTaskRepository.findAll().stream()
                .filter(f-> f.getLocalDateTime().equals(LocalDateTime.now().truncatedTo(ChronoUnit.MINUTES)))
                .collect(Collectors.toList());
    }
}
