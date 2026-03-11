package practice.generic;

public class Box<E> {
    private E content;

    public E getContent() {
        return content;
    }

    public void setContent(final E content) {
        this.content = content;
    }
}
