/*
 * This file is part of the BungeeIPC plugins for
 * BungeeCord and Bukkit servers for Minecraft.
 *
 * Copyright (C) 2020  Matt Ciolkosz (https://github.com/mciolkosz)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.bspfsystems.bungeeipc.api.plugin;

import org.bspfsystems.bungeeipc.api.IPCMessage;
import org.jetbrains.annotations.NotNull;

public interface IPCServerPlugin extends IPCPlugin {

    boolean isRegisteredServer(@NotNull String name);
    boolean isServerRunning(@NotNull String name);
    boolean isServerConnected(@NotNull String name);
    void restartServer(@NotNull String name);
    void broadcastMessage(@NotNull IPCMessage message);
}
