package common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Post implements Serializable, Comparable {

    public static final long serialVersionUID = 9220343759552300634L;
    private String writer;
    private String title;
    private String description;
    private long likes = 0;
    private long comment = 0;
    private long repost = 0;
    private List<User> likedUsersList = new ArrayList<>();
    private List<User> commentedUsersList = new ArrayList<>();
    private List<User> repostedUsersList = new ArrayList<>();
    private long timeOfPost = Time.getMilli();
    private String timeString = Time.getTime();
    private User user = new User();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getWriter() {
        return writer;
    }

    public List<User> getLikedUsersList() {
        return likedUsersList;
    }

    public void setLikedUsersList(List<User> likedUsersList) {
        this.likedUsersList = likedUsersList;
    }

    public long getLikes() {
        return likes;
    }

    public void setLikes(long likes) {
        this.likes = likes;
    }

    public void setComment(long comment) {
        this.comment = comment;
    }

    public void setRepost(long repost) {
        this.repost = repost;
    }

    public long getComment() {
        return comment;
    }

    public long getRepost() {
        return repost;
    }

    public List<User> getCommentedUsersList() {
        return commentedUsersList;
    }

    public List<User> getRepostedUsersList() {
        return repostedUsersList;
    }

    public void setCommentedUsersList(List<User> commentedUsersList) {
        this.commentedUsersList = commentedUsersList;
    }

    public void setRepostedUsersList(List<User> repostedUsersList) {
        this.repostedUsersList = repostedUsersList;
    }

    public void setTimeOfPost(long timeOfPost) {
        this.timeOfPost = timeOfPost;
    }

    public void setTimeString(String timeString) {
        this.timeString = timeString;
    }

    public long getTimeOfPost() {
        return timeOfPost;
    }

    public String getTimeString() {
        return timeString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return Objects.equals(title, post.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}