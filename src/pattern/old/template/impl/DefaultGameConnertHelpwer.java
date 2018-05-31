package pattern.old.template.impl;

import pattern.old.template.AbstGameConnectHelper;

public class DefaultGameConnertHelpwer extends AbstGameConnectHelper{

	@Override
	protected String doSecurity(String String) {
		System.out.println("decode : "+String);
		return String;
	}

	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("id pw 확인");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		System.out.println("권한 확인");
		return 0;
	}

	@Override
	protected String connection(String info) {
		System.out.println("connect : "+info);
		return "success";
	}
}
