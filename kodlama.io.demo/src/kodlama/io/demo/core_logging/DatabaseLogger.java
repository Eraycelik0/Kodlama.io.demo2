package kodlama.io.demo.core_logging;

public class DatabaseLogger implements Logger {
	@Override
	public void log(String message) {
		System.out.println("Logged to database : " + message);
	}
}
