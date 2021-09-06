package com.cuit.task_handle.taskFactory.impl;

import com.cuit.common.pojo.base.Task;
import com.cuit.task_handle.taskFactory.intf.TaskFactoryIntf;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 当前的task队列使用的是静态变量的方式
 * @author dailinfeng
 */
@Data
@Component
public class TaskFactoryStaticImpl implements TaskFactoryIntf {
    private static Queue<Task> taskQueue = new LinkedList<>();

    @Override
    public boolean offer(Task task) {
        return taskQueue.offer(task);
    }

    public Task peek() {
        return taskQueue.peek();
    }

    public Task poll() {
        return taskQueue.poll();
    }

    public boolean isEmpty() {
        return taskQueue.isEmpty();
    }
}
