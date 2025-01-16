package net.bloomnetwork.manager;

import net.md_5.bungee.api.plugin.Plugin;
import com.velocitypowered.api.proxy.ProxyServer;

import java.util.concurrent.TimeUnit;

public interface Megamind {
    /**
     * Checks if megamind already knows a task
     *
     * @param taskName to be checked
     * @return true if megamind knows the task, false otherwise
     */
    boolean doesTaskExist(String taskName);

    /**
     * Register task which will only run if this proxy is master (for bungee)
     *
     * @param name   that the task should be given
     * @param task   that should be ran
     * @param plugin instance
     */
    void registerTask(String name, Runnable task, Plugin plugin);

    /**
     * Register task which will only run if this proxy is master (for velocity)
     *
     * @param name        that the task should be given
     * @param task        that should be ran
     * @param proxyServer instance
     */
    void registerTask(String name, Runnable task, ProxyServer proxyServer, Object plugin);

    /**
     * Register task which will only run (and repeat) if this proxy is master (for bungee)
     *
     * @param name     that the task should be given
     * @param task     that should be ran
     * @param repeat   period in long
     * @param timeUnit at which the repeat long should be considered
     * @param plugin   instance
     */
    void registerRepeatingTask(String name, Runnable task, long repeat, TimeUnit timeUnit, Plugin plugin);

    /**
     * Register task which will only run (and repeat) if this proxy is master  (for velocity)
     *
     * @param name        that the task should be given
     * @param task        that should be ran
     * @param repeat      period in long
     * @param timeUnit    at which the repeat long should be considered
     * @param proxyServer instance
     */
    void registerRepeatingTask(String name, Runnable task, long repeat, TimeUnit timeUnit, ProxyServer proxyServer, Object plugin);
}
