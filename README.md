# vk_do_it
Пробуем собирать данные из VK
 
Задания
1. получение токена
https://oauth.vk.com/authorize?client_id=6287487&scope=1073737727&redirect_uri=https://oauth.vk.com/blank.html&display=page&response_type=token&revoke=1
Ответом будет служить подобная строка в браузере:
https://oauth.vk.com/blank.html#access_token=vk1.a.VHfZ5O3Z7PwKJkZpPpqbnhCW8N5oQmGh0o-9vmWOmhPXNmqRkgz5rG346YlmfM6Bgk4Ryp2hZkKrpjtA42XeIy-9N7WLhcvA29lEu5bU_0IInWejq_-IsohcA0cSAxZ7Pee8Cldt_WBrurijTnx254S4_iElKd5LcF1BEfle7DA3YlO7WtBH1eL_jnDPCP1VLgHihWu9-r5xZo5fXwbO-jg&expires_in=86400&user_id=3252819

где набор символов после "access_token=" и до "&expires_in=86400" и есть токен. В конце указывается id (идентификатор в социальной сети Вконтакте) пользователя.

Ответ
access_token =
 

2. Получим базовые поля пользователя с идентификатором 1

Информация по методу users.get https://vk.com/dev/users.get                

https://api.vk.com/method/users.get?user_id={}&access_token={}&v=5.131

https://api.vk.com/method/users.get?user_id=1&access_token=vk1.a.VHfZ5O3Z7PwKJkZpPpqbnhCW8N5oQmGh0o-9vmWOmhPXNmqRkgz5rG346YlmfM6Bgk4Ryp2hZkKrpjtA42XeIy-9N7WLhcvA29lEu5bU_0IInWejq_-IsohcA0cSAxZ7Pee8Cldt_WBrurijTnx254S4_iElKd5LcF1BEfle7DA3YlO7WtBH1eL_jnDPCP1VLgHihWu9-r5xZo5fXwbO-jg&v=5.131

Ответ:

 

3. Найдите свой идентификатор пользователя

а) в ссылке на свою страницу (vk.com/id1)

vk.com/yudinev

б) в ссылке на фото (https://vk.com/yudinev?z=photo3252819_323908652%2Falbum3252819_0%2Frev)

в) в ссылке на пост на стене (https://vk.com/yudinev?w=wall3252819_126)

 

Ответ:
my_id =

 

4. Получим базовые поля вашего профиля

https://api.vk.com/method/users.get?user_id={}&access_token={}&v=5.131

https://api.vk.com/method/users.get?user_id= yudinev &access_token=vk1.a.VHfZ5O3Z7PwKJkZpPpqbnhCW8N5oQmGh0o-9vmWOmhPXNmqRkgz5rG346YlmfM6Bgk4Ryp2hZkKrpjtA42XeIy-9N7WLhcvA29lEu5bU_0IInWejq_-IsohcA0cSAxZ7Pee8Cldt_WBrurijTnx254S4_iElKd5LcF1BEfle7DA3YlO7WtBH1eL_jnDPCP1VLgHihWu9-r5xZo5fXwbO-jg&v=5.131

 
Ответ:

 

5. Получим друзей пользователя с идентификатором 139044814

https://api.vk.com/method/friends.get?user_id={}&access_token={}&v=5.131

 

https://api.vk.com/method/friends.get?user_id=139044814&access_token=vk1.a.VHfZ5O3Z7PwKJkZpPpqbnhCW8N5oQmGh0o-9vmWOmhPXNmqRkgz5rG346YlmfM6Bgk4Ryp2hZkKrpjtA42XeIy-9N7WLhcvA29lEu5bU_0IInWejq_-IsohcA0cSAxZ7Pee8Cldt_WBrurijTnx254S4_iElKd5LcF1BEfle7DA3YlO7WtBH1eL_jnDPCP1VLgHihWu9-r5xZo5fXwbO-jg&v=5.131

Информация по методу friends.get https://vk.com/dev/friends.get

Ответ:

 

6. Сформируйте запрос к своему аккаунту с выгрузкой даты рождения (bdate),

текущего местоположения (city), родного города (home_town)

 

Описание всех полей пользователя https://vk.com/dev/objects/user

Работа с полями в запросе

Структура запроса: https://api.vk.com/method/название_метода?параметры_через_"&"&access_token={}&v=5.131

 

https://api.vk.com/method/users.get?user_id=3252819&access_token=vk1.a.VHfZ5O3Z7PwKJkZpPpqbnhCW8N5oQmGh0o-9vmWOmhPXNmqRkgz5rG346YlmfM6Bgk4Ryp2hZkKrpjtA42XeIy-9N7WLhcvA29lEu5bU_0IInWejq_-IsohcA0cSAxZ7Pee8Cldt_WBrurijTnx254S4_iElKd5LcF1BEfle7DA3YlO7WtBH1eL_jnDPCP1VLgHihWu9-r5xZo5fXwbO-jg&v=5.131&fields=sex,bdate,city,home_town&v=5.131

 

Описание метода users.get и дополнительных полей - https://vk.com/dev/users.get

список полей пречисляется через запятую, например fields=sex,contacts,screen_name

v=5.131 - версия API

Ответ:

 

7. Работа с подписчиками сообщества mmite_omgtu

 

Структура запроса: https://api.vk.com/method/название_метода?параметры_через_"&"&access_token={}&v=5.131

 

https://api.vk.com/method/ groups.getMembers?group_id= mmite_omgtu&access_token=vk1.a.VHfZ5O3Z7PwKJkZpPpqbnhCW8N5oQmGh0o-9vmWOmhPXNmqRkgz5rG346YlmfM6Bgk4Ryp2hZkKrpjtA42XeIy-9N7WLhcvA29lEu5bU_0IInWejq_-IsohcA0cSAxZ7Pee8Cldt_WBrurijTnx254S4_iElKd5LcF1BEfle7DA3YlO7WtBH1eL_jnDPCP1VLgHihWu9-r5xZo5fXwbO-jg&v=5.131&fields=sex,bdate,city,home_town&v=5.131

 


Информация по методу groups.getMembers https://vk.com/dev/groups.getMembers

Выгрузите 10 подписчиков сообщества https://vk.com/mmite_omgtu с полями city,home_town,education,bdate

 

Ответ:268

 
