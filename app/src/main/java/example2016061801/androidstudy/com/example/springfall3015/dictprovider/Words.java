package example2016061801.androidstudy.com.example.springfall3015.dictprovider;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Created by springfall3015 on 2016/6/18.
 */
public final class Words {
    public static final String AUTHORITY = "org.crazyit.providers.dictprovider";
    public static final class Word implements BaseColumns {
        public final static String _ID = "_id";
        public final static String WORD = "word";
        public final static String DETALL = "detall";
        public final static Uri DICT_CONTEN_URI = Uri.parse("content://"+AUTHORITY+"/words");
        public final static Uri WORD_CONTENT_URI = Uri.parse("content://"+AUTHORITY+"/word");
    }
}
