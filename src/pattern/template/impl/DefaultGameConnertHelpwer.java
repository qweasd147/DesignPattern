package pattern.template.impl;

import pattern.template.AbstGameConnectHelper;

public class DefaultGameConnertHelpwer extends AbstGameConnectHelper{

	@Override
	protected String doSecurity(String String) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean authentication(String id, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected int authorization(String userName) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected String connection(String info) {
		// TODO Auto-generated method stub
		return null;
	}
}
