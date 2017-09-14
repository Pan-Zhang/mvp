package asuper.zhangpan.mvc.base;

import java.lang.ref.WeakReference;

/**
 * Created by zhangpan on 17/9/14.
 */

public class BasePresent<T> {

    private WeakReference<T> view;

    public BasePresent(T t){
        view = new WeakReference<T>(t);
    }

    public T getView() throws Exception{
        if(view.get()==null) throw new Exception("have been dispose");
        return view.get();
    }

}
