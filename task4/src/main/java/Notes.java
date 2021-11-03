import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Notes {
    private final ReentrantReadWriteLock Lock = new ReentrantReadWriteLock();
    public List<String> notes = new ArrayList<>();

    public void removeNote(int index) {
        Lock.writeLock().lock();
        try {
            String note;
            note = notes.remove(index);
            System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
        } finally {
            Lock.writeLock().unlock();
        }
    }

    public void readNote(int index) {
        Lock.readLock().lock();
        try {
            System.out.println("Сейчас будет прочтена заметка с позиции " + index);
            String note;
            note = notes.get(index);
            System.out.println("Прочтена заметка [" + note + "] с позиции " + index);
        } finally {
            Lock.readLock().unlock();
        }
    }

    public void addNote(int index, String note) {
        Lock.writeLock().lock();
        System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
        try {
            notes.add(index, note);
        } finally {
            System.out.println("Уже добавлена заметка [" + note + "]");
            Lock.writeLock().unlock();
        }
    }
}