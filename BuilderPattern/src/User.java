/**
 * 项目:  Subject2Observer <br>
 * 类名:  PACKAGE_NAME<br>
 * 描述:  构造者模式 - Builder<br>
 * 创建人: jason<br>
 * 创建时间: 2018/8/28 21:39<br>
 */
public class User {
    private final String mFirstName;//必选属性
    private final String mLastName;//必选属性
    private final String mGender;//必选属性
    private int mAge;//可选属性
    private String mPhoneNo;

    private User(Builder builder) {
        mFirstName = builder.mFirstName;
        mLastName = builder.mLastName;
        mGender = builder.mGender;
        mAge = builder.mAge;
        mPhoneNo = builder.mPhoneNo;
    }


    public static final class Builder {
        private final String mFirstName;
        private final String mLastName;
        private final String mGender;
        private int mAge;
        private String mPhoneNo;

        public Builder(String mFirstName, String mLastName, String mGender) {
            this.mFirstName = mFirstName;
            this.mLastName = mLastName;
            this.mGender = mGender;
        }

        public Builder mAge(int val) {
            mAge = val;
            return this;
        }

        public Builder mPhoneNo(String val) {
            mPhoneNo = val;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
