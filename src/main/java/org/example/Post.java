package org.example;

public class Post {
    public FormDate birthday;
    public String name;
    public String passport;
    public String patronymic;
    public String phone;
    public String surname;
    public Boolean subscription;

    public Post(
            FormDate birthday,
            String name,
            String passport,
            String patronymic,
            String phone,
            String surname,
            Boolean subscription)
    {
        this.birthday = birthday;
        this.name = name;
        this.passport = passport;
        this.patronymic = patronymic;
        this.phone = phone;
        this.surname = surname;
        this.subscription = subscription;
    }

    public String showInfo(){
        return
                "Дата рождения: " + this.birthday.showBirthday() +
                        "\nИмя: " + this.name +
                        "\nФамилия: " + this.surname +
                        "\nОтчество: " + this.patronymic +
                        "\nПаспорт: " + this.passport +
                        "\nТелефон: " + this.phone +
                        "\nПодписка на новости о скидках: " + (this.subscription ? "есть" : "нет");
    }
}

