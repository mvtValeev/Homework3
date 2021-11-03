public final class SingletonTask
{
    private static SingletonTask instance;
    String value;

    private SingletonTask(String value)
    {
        // Этот код эмулирует медленную инициализацию
        try
        {
            Thread.sleep(10000);
        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
        this.value = value;
    }

    static SingletonTask getInstance(String value)
    {   SingletonTask localInstance = instance;
        if (localInstance == null)
        {synchronized (SingletonTask.class) {
            localInstance = instance;
            if (localInstance == null) {
                instance = localInstance = new SingletonTask(value);
            }
        }
        }
        return localInstance;
    }
}
