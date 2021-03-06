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

package shinil35.shat.network.packet;

import java.security.PublicKey;

import shinil35.shat.Main;
import shinil35.shat.network.NetworkConnectionData;
import shinil35.shat.network.NetworkManager;
import shinil35.shat.util.Encoding;
import shinil35.shat.util.Utility;

public class P0_PublicKey implements IPacket
{
	private byte[] encodedPublicKey;
	private int listeningPort;
	private byte[] randomBytes;

	@Override
	public void dispose()
	{
		encodedPublicKey = null;
		listeningPort = -1;
		randomBytes = null;
	}

	public int getListeningPort()
	{
		return listeningPort;
	}

	public PublicKey getPublicKey()
	{
		return Encoding.decodePublicKey(encodedPublicKey);
	}

	public byte[] getRandomBytes()
	{
		return randomBytes;
	}

	@Override
	public void writePacket(NetworkConnectionData connectionData, IPacket oldPacket, Object packetData)
	{
		encodedPublicKey = Encoding.encodePublicKey(Main.getPublicKey());
		listeningPort = NetworkManager.getListeningPort();
		randomBytes = Utility.randomBytes(128);
	}
}
