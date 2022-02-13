package chalkboard.me.bulletinboard.domain.model;

public interface UserCommentRepository {
    void save(UserComment userComment);
    UserComments select();
}
