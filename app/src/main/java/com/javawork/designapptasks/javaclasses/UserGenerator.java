package com.javawork.designapptasks.javaclasses;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserGenerator {
    private static final int USER_COUNT = 30;

    public static List<User> generateUsers() {
        List<User> userList = new ArrayList<>();
        Faker faker = new Faker();

        for (int i = 0; i < USER_COUNT; i++) {
            User user = new User();
            user.setFirstName(faker.name().firstName());
            user.setLastName(faker.name().lastName());
            user.setAge(faker.number().numberBetween(18, 60));
            user.setSex(faker.options().option("Male", "Female"));
            user.setSquareAvatarUrl("https://image.cnbcfm.com/api/vl/image/105773423-1551716977" +
                    "818rtx6p9vw.ipg?v=1551717428&w=700&h=700");
            user.setDescription(Arrays.asList(faker.lorem().paragraphs(faker.number().numberBetween(1, 5)).toString()));
            userList.add(user);
        }
        return userList;
    }
}

