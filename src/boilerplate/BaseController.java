package boilerplate;

public class BaseController
	{
		
	BaseModel model;
	BaseView view;
	
	public void SetModel(BaseModel aModel)
	{model = aModel;}
	
	public void SetView(BaseView aView)
	{
		view = aView;
	}

	}
