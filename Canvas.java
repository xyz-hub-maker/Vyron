import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class Canvas {
    private android.graphics.Canvas mCanvas;
    private Paint mPaint;

    public Canvas(android.graphics.Canvas canvas) {
        this.mCanvas = canvas;
        this.mPaint = new Paint();
    }

    public void drawRect(float left, float top, float right, float bottom, Paint paint) {
        mCanvas.drawRect(left, top, right, bottom, paint);
    }

    public void drawCircle(float cx, float cy, float radius, Paint paint) {
        mCanvas.drawCircle(cx, cy, radius, paint);
    }

    public void drawText(String text, float x, float y, Paint paint) {
        mCanvas.drawText(text, x, y, paint);
    }

    public void drawImage(Bitmap bitmap, float left, float top) {
        mCanvas.drawBitmap(bitmap, left, top, null);
    }

    public void save() {
        mCanvas.save();
    }

    public void restore() {
        mCanvas.restore();
    }

    public void translate(float dx, float dy) {
        mCanvas.translate(dx, dy);
    }

    public void scale(float sx, float sy) {
        mCanvas.scale(sx, sy);
    }

    public void rotate(float degrees) {
        mCanvas.rotate(degrees);
    }

    public void clipRect(Rect rect) {
        mCanvas.clipRect(rect);
    }
}