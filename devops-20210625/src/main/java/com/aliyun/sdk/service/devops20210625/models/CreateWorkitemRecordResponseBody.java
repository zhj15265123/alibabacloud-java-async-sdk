// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWorkitemRecordResponseBody} extends {@link TeaModel}
 *
 * <p>CreateWorkitemRecordResponseBody</p>
 */
public class CreateWorkitemRecordResponseBody extends TeaModel {
    @NameInMap("WorkitemTime")
    private WorkitemTime workitemTime;

    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMsg")
    private String errorMsg;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    private CreateWorkitemRecordResponseBody(Builder builder) {
        this.workitemTime = builder.workitemTime;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWorkitemRecordResponseBody create() {
        return builder().build();
    }

    /**
     * @return workitemTime
     */
    public WorkitemTime getWorkitemTime() {
        return this.workitemTime;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private WorkitemTime workitemTime; 
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 
        private Boolean success; 

        /**
         * WorkitemTime.
         */
        public Builder workitemTime(WorkitemTime workitemTime) {
            this.workitemTime = workitemTime;
            return this;
        }

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateWorkitemRecordResponseBody build() {
            return new CreateWorkitemRecordResponseBody(this);
        } 

    } 

    public static class RecordUser extends TeaModel {
        @NameInMap("account")
        private String account;

        @NameInMap("avatar")
        private String avatar;

        @NameInMap("dingTalkId")
        private String dingTalkId;

        @NameInMap("displayName")
        private String displayName;

        @NameInMap("displayNickName")
        private String displayNickName;

        @NameInMap("displayRealName")
        private String displayRealName;

        @NameInMap("email")
        private String email;

        @NameInMap("gender")
        private String gender;

        @NameInMap("identifier")
        private String identifier;

        @NameInMap("isDisabled")
        private Boolean isDisabled;

        @NameInMap("mobile")
        private String mobile;

        @NameInMap("nameEn")
        private String nameEn;

        @NameInMap("nickName")
        private String nickName;

        @NameInMap("nickNamePinyin")
        private String nickNamePinyin;

        @NameInMap("realName")
        private String realName;

        @NameInMap("realNamePinyin")
        private String realNamePinyin;

        @NameInMap("stamp")
        private String stamp;

        @NameInMap("tbRoleId")
        private String tbRoleId;

        private RecordUser(Builder builder) {
            this.account = builder.account;
            this.avatar = builder.avatar;
            this.dingTalkId = builder.dingTalkId;
            this.displayName = builder.displayName;
            this.displayNickName = builder.displayNickName;
            this.displayRealName = builder.displayRealName;
            this.email = builder.email;
            this.gender = builder.gender;
            this.identifier = builder.identifier;
            this.isDisabled = builder.isDisabled;
            this.mobile = builder.mobile;
            this.nameEn = builder.nameEn;
            this.nickName = builder.nickName;
            this.nickNamePinyin = builder.nickNamePinyin;
            this.realName = builder.realName;
            this.realNamePinyin = builder.realNamePinyin;
            this.stamp = builder.stamp;
            this.tbRoleId = builder.tbRoleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordUser create() {
            return builder().build();
        }

        /**
         * @return account
         */
        public String getAccount() {
            return this.account;
        }

        /**
         * @return avatar
         */
        public String getAvatar() {
            return this.avatar;
        }

        /**
         * @return dingTalkId
         */
        public String getDingTalkId() {
            return this.dingTalkId;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return displayNickName
         */
        public String getDisplayNickName() {
            return this.displayNickName;
        }

        /**
         * @return displayRealName
         */
        public String getDisplayRealName() {
            return this.displayRealName;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return gender
         */
        public String getGender() {
            return this.gender;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return isDisabled
         */
        public Boolean getIsDisabled() {
            return this.isDisabled;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return nameEn
         */
        public String getNameEn() {
            return this.nameEn;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return nickNamePinyin
         */
        public String getNickNamePinyin() {
            return this.nickNamePinyin;
        }

        /**
         * @return realName
         */
        public String getRealName() {
            return this.realName;
        }

        /**
         * @return realNamePinyin
         */
        public String getRealNamePinyin() {
            return this.realNamePinyin;
        }

        /**
         * @return stamp
         */
        public String getStamp() {
            return this.stamp;
        }

        /**
         * @return tbRoleId
         */
        public String getTbRoleId() {
            return this.tbRoleId;
        }

        public static final class Builder {
            private String account; 
            private String avatar; 
            private String dingTalkId; 
            private String displayName; 
            private String displayNickName; 
            private String displayRealName; 
            private String email; 
            private String gender; 
            private String identifier; 
            private Boolean isDisabled; 
            private String mobile; 
            private String nameEn; 
            private String nickName; 
            private String nickNamePinyin; 
            private String realName; 
            private String realNamePinyin; 
            private String stamp; 
            private String tbRoleId; 

            /**
             * account.
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

            /**
             * avatar.
             */
            public Builder avatar(String avatar) {
                this.avatar = avatar;
                return this;
            }

            /**
             * dingTalkId.
             */
            public Builder dingTalkId(String dingTalkId) {
                this.dingTalkId = dingTalkId;
                return this;
            }

            /**
             * displayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * displayNickName.
             */
            public Builder displayNickName(String displayNickName) {
                this.displayNickName = displayNickName;
                return this;
            }

            /**
             * displayRealName.
             */
            public Builder displayRealName(String displayRealName) {
                this.displayRealName = displayRealName;
                return this;
            }

            /**
             * email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * gender.
             */
            public Builder gender(String gender) {
                this.gender = gender;
                return this;
            }

            /**
             * identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * isDisabled.
             */
            public Builder isDisabled(Boolean isDisabled) {
                this.isDisabled = isDisabled;
                return this;
            }

            /**
             * mobile.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * nameEn.
             */
            public Builder nameEn(String nameEn) {
                this.nameEn = nameEn;
                return this;
            }

            /**
             * nickName.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * nickNamePinyin.
             */
            public Builder nickNamePinyin(String nickNamePinyin) {
                this.nickNamePinyin = nickNamePinyin;
                return this;
            }

            /**
             * realName.
             */
            public Builder realName(String realName) {
                this.realName = realName;
                return this;
            }

            /**
             * realNamePinyin.
             */
            public Builder realNamePinyin(String realNamePinyin) {
                this.realNamePinyin = realNamePinyin;
                return this;
            }

            /**
             * stamp.
             */
            public Builder stamp(String stamp) {
                this.stamp = stamp;
                return this;
            }

            /**
             * tbRoleId.
             */
            public Builder tbRoleId(String tbRoleId) {
                this.tbRoleId = tbRoleId;
                return this;
            }

            public RecordUser build() {
                return new RecordUser(this);
            } 

        } 

    }
    public static class WorkitemTime extends TeaModel {
        @NameInMap("actualTime")
        private Long actualTime;

        @NameInMap("description")
        private String description;

        @NameInMap("gmtEnd")
        private Long gmtEnd;

        @NameInMap("gmtStart")
        private Long gmtStart;

        @NameInMap("identifier")
        private String identifier;

        @NameInMap("recordUser")
        private RecordUser recordUser;

        @NameInMap("type")
        private String type;

        @NameInMap("workitemIdentifier")
        private String workitemIdentifier;

        private WorkitemTime(Builder builder) {
            this.actualTime = builder.actualTime;
            this.description = builder.description;
            this.gmtEnd = builder.gmtEnd;
            this.gmtStart = builder.gmtStart;
            this.identifier = builder.identifier;
            this.recordUser = builder.recordUser;
            this.type = builder.type;
            this.workitemIdentifier = builder.workitemIdentifier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkitemTime create() {
            return builder().build();
        }

        /**
         * @return actualTime
         */
        public Long getActualTime() {
            return this.actualTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtEnd
         */
        public Long getGmtEnd() {
            return this.gmtEnd;
        }

        /**
         * @return gmtStart
         */
        public Long getGmtStart() {
            return this.gmtStart;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return recordUser
         */
        public RecordUser getRecordUser() {
            return this.recordUser;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return workitemIdentifier
         */
        public String getWorkitemIdentifier() {
            return this.workitemIdentifier;
        }

        public static final class Builder {
            private Long actualTime; 
            private String description; 
            private Long gmtEnd; 
            private Long gmtStart; 
            private String identifier; 
            private RecordUser recordUser; 
            private String type; 
            private String workitemIdentifier; 

            /**
             * actualTime.
             */
            public Builder actualTime(Long actualTime) {
                this.actualTime = actualTime;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * gmtEnd.
             */
            public Builder gmtEnd(Long gmtEnd) {
                this.gmtEnd = gmtEnd;
                return this;
            }

            /**
             * gmtStart.
             */
            public Builder gmtStart(Long gmtStart) {
                this.gmtStart = gmtStart;
                return this;
            }

            /**
             * identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * recordUser.
             */
            public Builder recordUser(RecordUser recordUser) {
                this.recordUser = recordUser;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * workitemIdentifier.
             */
            public Builder workitemIdentifier(String workitemIdentifier) {
                this.workitemIdentifier = workitemIdentifier;
                return this;
            }

            public WorkitemTime build() {
                return new WorkitemTime(this);
            } 

        } 

    }
}
