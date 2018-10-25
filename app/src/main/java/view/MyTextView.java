package view;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * @author : 老头儿
 * @email : 527672827@qq.com
 * @org : 河北北方学院 移动开发工程部 C508
 * @function : （功能）
 */
public class MyTextView extends TextView{

    public MyTextView(Context context) {
        super(context);
        // TODO Auto-generated constructor stub
    }
    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
    }
    public MyTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Layout layout = getLayout();
        if (layout != null) {
            int hegith;
            if (this.getText().length() > 50){
                 hegith = (int) (getResources().getDisplayMetrics().density * 16 * 3);
            }else {
                if (this.getText().length() < 20){
                    hegith = (int)(getResources().getDisplayMetrics().density * 23 * 1);
                }else if (this.getText().length() < 35){
                    hegith = (int)(getResources().getDisplayMetrics().density * 23 * 2);
                }else {
                    hegith = (int)(getResources().getDisplayMetrics().density * 23 * 3);
                }
            }
            int width = getMeasuredWidth();
            setMeasuredDimension(width, hegith);
        }
    }
}
