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

    public static final int TOP = 5;
    public static final int CENTER = 6;
    public static final int BOTTOM = 7;

    public ToastPerfect(Context context) {
        super(context);
    }

    public static Toast makeText(Context context, int type, String content, int position, int duration) {
        Toast toast = new Toast(context); // Init

        toast.setDuration(duration); // Set duration for Toast

        switch (position) { // Set position for Toast
            case TOP: {
                toast.setGravity(Gravity.TOP, 0, 100);
                break;
            }
            case CENTER: {
                toast.setGravity(Gravity.CENTER, 0, 0);
                break;
            }
            case BOTTOM: {
                toast.setGravity(Gravity.BOTTOM, 0, 100);
                break;
            }
        }

        View layout = LayoutInflater.from(context).inflate(R.layout.layout_toast, null, false); // Get View from layout
        ImageView ivIconToast = layout.findViewById(R.id.ivIconToast);
        TextView tvTextToast = layout.findViewById(R.id.tvTextToast);
        if (content.isEmpty()) { // Set text for Toast
            tvTextToast.setText("");
        } else {
            tvTextToast.setText(content.trim());
        }

        switch (type) { // Set layout for Toast
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

        toast.setView(layout); // Set View for Toast
        return toast;
    }
}
