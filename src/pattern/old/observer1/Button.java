package pattern.old.observer1;

public class Button {

	
	public interface OnClickListener{
		public void onClick(Button button);
	}
	
	private OnClickListener onClickListener;
	
	public void onClick(){
		//이벤트 처리
		if(onClickListener != null){
			
			onClickListener.onClick(this);
			
			onClickListener = null;
		}
		
	}
	
	
	public void setOnClickListener(OnClickListener onClickListener){
		this.onClickListener = onClickListener;
		
	}
}
