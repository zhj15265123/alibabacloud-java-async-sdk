// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUsersPasswordResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUsersPasswordResponseBody</p>
 */
public class DescribeUsersPasswordResponseBody extends TeaModel {
    @NameInMap("DesktopUsers")
    private java.util.List < DesktopUsers> desktopUsers;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeUsersPasswordResponseBody(Builder builder) {
        this.desktopUsers = builder.desktopUsers;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUsersPasswordResponseBody create() {
        return builder().build();
    }

    /**
     * @return desktopUsers
     */
    public java.util.List < DesktopUsers> getDesktopUsers() {
        return this.desktopUsers;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DesktopUsers> desktopUsers; 
        private String requestId; 

        /**
         * The users that are associated with cloud desktop.
         */
        public Builder desktopUsers(java.util.List < DesktopUsers> desktopUsers) {
            this.desktopUsers = desktopUsers;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUsersPasswordResponseBody build() {
            return new DescribeUsersPasswordResponseBody(this);
        } 

    } 

    public static class DesktopUsers extends TeaModel {
        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("EndUserId")
        private String endUserId;

        @NameInMap("Password")
        private String password;

        private DesktopUsers(Builder builder) {
            this.displayName = builder.displayName;
            this.endUserId = builder.endUserId;
            this.password = builder.password;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DesktopUsers create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        public static final class Builder {
            private String displayName; 
            private String endUserId; 
            private String password; 

            /**
             * The display name of the user.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * The ID of the end user.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * The password of the user.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            public DesktopUsers build() {
                return new DesktopUsers(this);
            } 

        } 

    }
}
