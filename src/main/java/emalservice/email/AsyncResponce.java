package emalservice.email;


import java.sql.Time;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class AsyncResponce<V> implements Future<V> {

    private V value;
    private Exception executionExeception;
    private boolean isCompletedExceptionally = false;
    private boolean isCancelled = false;
    private boolean isDone = false;
    private long checkCompletedInterval = 100;

    public AsyncResponce() {

    }

    public AsyncResponce(V value) {
        this.value = value;
        this.isDone = true;
    }


    public AsyncResponce(Throwable ex) {
        this.executionExeception = new ExecutionException(ex);
        this.isCompletedExceptionally = true;
        this.isDone = true;


    }


    @Override
    public boolean cancel(boolean mayInterruptIfRunning) {
        return false;
    }

    public boolean isCancelled() {
        return false;
    }

    @Override
    public V get() throws InterruptedException, ExecutionException {
        return null;

    }

    @Override
    public V get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }


}
