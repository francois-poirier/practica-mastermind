package mastermind.distributed.dispatchers;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import mastermind.types.Color;
import mastermind.types.Error;
import mastermind.types.FrameType;

public class TCPIP extends mastermind.utils.TCPIP {

	public static TCPIP createClientSocket() {
		try {
			Socket socket = new Socket("localhost", 2020);
			System.out.println("Cliente> Establecida conexion");
			return new TCPIP(socket);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static TCPIP createServerSocket() {
		try {
			ServerSocket serverSocket = new ServerSocket(2020);
			System.out.println("Servidor> Esperando conexion...");
			Socket socket = serverSocket.accept();
			System.out.println("Servidor> Recibida conexion de " + socket.getInetAddress().getHostAddress() + ":"
					+ socket.getPort());
			return new TCPIP(serverSocket, socket);
		} catch (IOException ex) {
			ex.printStackTrace();
			return null;
		}
	}

	
	public TCPIP(Socket socket) {
		super(socket);
	}
	
	public TCPIP(ServerSocket serverSocket, Socket socket) {
		super(serverSocket, socket);
	}

	public void send(Color value) {
		if (value == null) {
			this.send("null");
		}else {
			this.send(value.name());			
		}
	}

	public void send(Error value) {
		if (value == null) {
			this.send("null");
		}else {
			this.send(value.name());
		}
	}

	public Error receiveError() {
		String error = this.receiveLine();
		if (error.equals("null")) {
			return null;
		}
		return Error.valueOf(error);
	}

	public Color receiveColor() {
		String color = this.receiveLine();
		if (color.equals("null")) {
			return null;
		}else {
			return Color.valueOf(color);			
		}
	}

	public void close() {
		this.send(FrameType.CLOSE.name());
		super.close();
	}	

}
