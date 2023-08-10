package com.tgbotuser.tgbot.repository;

import com.tgbotuser.tgbot.entity.NotificationTask;
import org.springframework.data.jpa.repository.JpaRepository;


public interface NotificationTaskRepository extends JpaRepository<NotificationTask,Long> {
}
