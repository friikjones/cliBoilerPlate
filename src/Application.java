import boilerplate.*;

public class Application
	{
		static Application		instance;
		
		ApplicationModel 		model;
		ApplicationView 		view;
		ApplicationController 	controller;
		
		public static void main(String[] args) 
		{
		instance = new Application(args);
		}
		
		void initialize()
		{
			controller = new ApplicationController();
			view = new ApplicationView();
			model = new ApplicationModel();
			
			controller.SetView(view);
			controller.SetModel(model);
			
			view.SetController(controller);
			view.SetModel(model);
			
			model.SetContoller(controller);
			model.SetView(view);	
			
		
		}
		
		Application(String[] args)
		{
		initialize();
		for (int i = 0; i < args.length; i++)
			{
				controller.addCommandLineArgument(args[i]);
			}
		
		view.PrintCommandLineArguments();
		
		
		
		
		}

	}
