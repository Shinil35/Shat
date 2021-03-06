/*	Copyright (C) 2013 Emilio Cafe' Nunes
 *
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package shinil35.shat.util;

import java.net.InetAddress;
import java.util.Date;
import java.util.Random;

public class Utility
{
	public static long getElapsedFromTime(long timeA)
	{
		return getTimeNow() - timeA;
	}

	public static long getTimeNow()
	{
		return new Date().getTime();
	}

	public static boolean isValidAddress(String IP, int port)
	{
		try
		{
			if (port <= 0 || port >= 65535)
				return false;

			InetAddress.getByName(IP);
			return true;
		}
		catch (Exception e)
		{
			return false;
		}
	}

	public static byte[] randomBytes(int size)
	{
		byte[] randomBytes = new byte[size];

		Random random = new Random();
		random.nextBytes(randomBytes);

		return randomBytes;
	}
}
