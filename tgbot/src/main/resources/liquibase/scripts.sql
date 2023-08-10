create table if not exists notification_task(
 id bigserial primary key,
 chatId bigint,
 messageText varchar(250),
 localDateTime timestamp
);