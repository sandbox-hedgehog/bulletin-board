package chalkboard.me.bulletinboard.domain.model;

import chalkboard.me.bulletinboard.domain.type.Comment;
import chalkboard.me.bulletinboard.domain.type.MailAddress;
import chalkboard.me.bulletinboard.domain.type.Name;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Random;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class UserComment {
    private final Name name;
    private final UserId userId;
    private final MailAddress mailAddress;
    private final Comment comment;

    public static UserComment from(String name, String userId, String mailAddress, String comment) {
        return new UserComment(
                Name.from(name),
                UserId.from(userId),
                MailAddress.from(mailAddress),
                Comment.from(comment)
        );
    }

    public Name getName() {
        if (!name.equals("!omikuji")) return name;

        int random = new Random().nextInt(3);

        switch (random) {
            case 0:
                return Name.from("大吉");
            case 1:
                return Name.from("中吉");
            default:
                return Name.from("小吉");
        }
    }
}
