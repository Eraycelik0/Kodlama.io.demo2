package kodlama.io.demo.core_logging;

public class FileLogger implements Logger {
	@Override
	public void log(String message) {
		System.out.println("File to logger " + message);
	}
}
