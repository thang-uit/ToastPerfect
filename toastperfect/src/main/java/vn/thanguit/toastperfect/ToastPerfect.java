package vn.thanguit.toastperfect;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/*************************************************************
 * Toast Perfect Library
 * Author: Chu Nam Thang (Call me ThangUIT) - From Viet Nam <3
 * Year: 2022
*************************************************************/

public class ToastPerfect extends Toast {
    public static final int SUCCESS = 1;
    public static final int ERROR = 2;
    public static final int WARNING = 3;
    public static final int INFORMATION = 4;

    public static final int TOP = Gravity.TOP;
    public static final int CENTER = Gravity.CENTER;
    public static final int BOTTOM = Gravity.BOTTOM;


    public ToastPerfect(Context context) {
        super(context);
    }

    public static Toast makeText(Context context, int type, String content, int duration) {
        Toast toast = new Toast(context);

        toast.setDuration(duration);

        toast.setGravity(BOTTOM, 0, 0);


        View layout = LayoutInflater.from(context).inflate(R.layout.layout_toast, null, false);
        ImageView ivIconToast = layout.findViewById(R.id.ivIconToast);
        TextView tvTextToast = layout.findViewById(R.id.tvTextToast);
        if (content.isEmpty()) {
            tvTextToast.setText("");
        } else {
            tvTextToast.setText(content.trim());
        }

        switch (type) {
            case SUCCESS: {
                ivIconToast.setImageResource(R.drawable.ic_success);
                break;
            }
            case ERROR: {
                ivIconToast.setImageResource(R.drawable.ic_error);
                break;
            }

            case WARNING: {
                ivIconToast.setImageResource(R.drawable.ic_warning);
                break;
            }

            case INFORMATION: {
                ivIconToast.setImageResource(R.drawable.ic_info);
                break;
            }
        }

        toast.setView(layout);
        return toast;
    }
}
