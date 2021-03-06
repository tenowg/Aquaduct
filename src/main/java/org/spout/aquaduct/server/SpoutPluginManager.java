/*
 * This file is part of Aquaduct.
 *
 * Copyright (c) 2012-2013, Spout LLC <http://www.spout.org/>
 * Aquaduct is licensed under the GNU Affero General Public License.
 *
 * Aquaduct is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * Aquaduct is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.spout.aquaduct.server;

import java.util.List;

public class SpoutPluginManager extends PluginManager {
	public SpoutPluginManager(Server parent) {
		super(parent);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setPluginEnabled(Plugin plugin, boolean enabled) throws PluginException {
		// TODO Auto-generated method stub
	}

	@Override
	public void installPlugin(Plugin toInstall) throws PluginException {
		// TODO Auto-generated method stub
	}

	@Override
	public void removePlugin(Plugin toRemove) throws PluginException {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Plugin> getInstalledPlugins() {
		// TODO Auto-generated method stub
		return null;
	}
}
