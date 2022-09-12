package sbeans;


import org.springframework.stereotype.Component;

@Component("eEngine")
	public class ElectricEngine implements IEngine {

		public ElectricEngine() {
			System.out.println("EletricEngine:: 0-param constructor");
		}
		
		@Override
		public void start() {
	       System.out.println("EletricEngine :: started");
		}

		@Override
		public void stop() {
		       System.out.println("ElectricEngine :: stopped");
		}

}
