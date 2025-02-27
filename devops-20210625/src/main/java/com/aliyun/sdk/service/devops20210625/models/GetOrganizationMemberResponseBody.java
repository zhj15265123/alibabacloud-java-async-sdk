// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOrganizationMemberResponseBody} extends {@link TeaModel}
 *
 * <p>GetOrganizationMemberResponseBody</p>
 */
public class GetOrganizationMemberResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("member")
    private Member member;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    private GetOrganizationMemberResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.member = builder.member;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOrganizationMemberResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return member
     */
    public Member getMember() {
        return this.member;
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
        private String errorCode; 
        private String errorMessage; 
        private Member member; 
        private String requestId; 
        private Boolean success; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * member.
         */
        public Builder member(Member member) {
            this.member = member;
            return this;
        }

        /**
         * requestId.
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

        public GetOrganizationMemberResponseBody build() {
            return new GetOrganizationMemberResponseBody(this);
        } 

    } 

    public static class Identities extends TeaModel {
        @NameInMap("externUid")
        private String externUid;

        @NameInMap("provider")
        private String provider;

        private Identities(Builder builder) {
            this.externUid = builder.externUid;
            this.provider = builder.provider;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Identities create() {
            return builder().build();
        }

        /**
         * @return externUid
         */
        public String getExternUid() {
            return this.externUid;
        }

        /**
         * @return provider
         */
        public String getProvider() {
            return this.provider;
        }

        public static final class Builder {
            private String externUid; 
            private String provider; 

            /**
             * externUid.
             */
            public Builder externUid(String externUid) {
                this.externUid = externUid;
                return this;
            }

            /**
             * provider.
             */
            public Builder provider(String provider) {
                this.provider = provider;
                return this;
            }

            public Identities build() {
                return new Identities(this);
            } 

        } 

    }
    public static class Member extends TeaModel {
        @NameInMap("accountId")
        private String accountId;

        @NameInMap("birthday")
        private Long birthday;

        @NameInMap("deptLists")
        private java.util.List < String > deptLists;

        @NameInMap("email")
        private String email;

        @NameInMap("hiredDate")
        private Long hiredDate;

        @NameInMap("identities")
        private Identities identities;

        @NameInMap("joinTime")
        private Long joinTime;

        @NameInMap("lastVisitTime")
        private Long lastVisitTime;

        @NameInMap("mobile")
        private String mobile;

        @NameInMap("organizationMemberName")
        private String organizationMemberName;

        @NameInMap("organizationRoleId")
        private String organizationRoleId;

        @NameInMap("organizationRoleName")
        private String organizationRoleName;

        @NameInMap("state")
        private String state;

        private Member(Builder builder) {
            this.accountId = builder.accountId;
            this.birthday = builder.birthday;
            this.deptLists = builder.deptLists;
            this.email = builder.email;
            this.hiredDate = builder.hiredDate;
            this.identities = builder.identities;
            this.joinTime = builder.joinTime;
            this.lastVisitTime = builder.lastVisitTime;
            this.mobile = builder.mobile;
            this.organizationMemberName = builder.organizationMemberName;
            this.organizationRoleId = builder.organizationRoleId;
            this.organizationRoleName = builder.organizationRoleName;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Member create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return birthday
         */
        public Long getBirthday() {
            return this.birthday;
        }

        /**
         * @return deptLists
         */
        public java.util.List < String > getDeptLists() {
            return this.deptLists;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return hiredDate
         */
        public Long getHiredDate() {
            return this.hiredDate;
        }

        /**
         * @return identities
         */
        public Identities getIdentities() {
            return this.identities;
        }

        /**
         * @return joinTime
         */
        public Long getJoinTime() {
            return this.joinTime;
        }

        /**
         * @return lastVisitTime
         */
        public Long getLastVisitTime() {
            return this.lastVisitTime;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return organizationMemberName
         */
        public String getOrganizationMemberName() {
            return this.organizationMemberName;
        }

        /**
         * @return organizationRoleId
         */
        public String getOrganizationRoleId() {
            return this.organizationRoleId;
        }

        /**
         * @return organizationRoleName
         */
        public String getOrganizationRoleName() {
            return this.organizationRoleName;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String accountId; 
            private Long birthday; 
            private java.util.List < String > deptLists; 
            private String email; 
            private Long hiredDate; 
            private Identities identities; 
            private Long joinTime; 
            private Long lastVisitTime; 
            private String mobile; 
            private String organizationMemberName; 
            private String organizationRoleId; 
            private String organizationRoleName; 
            private String state; 

            /**
             * accountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * birthday.
             */
            public Builder birthday(Long birthday) {
                this.birthday = birthday;
                return this;
            }

            /**
             * deptLists.
             */
            public Builder deptLists(java.util.List < String > deptLists) {
                this.deptLists = deptLists;
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
             * hiredDate.
             */
            public Builder hiredDate(Long hiredDate) {
                this.hiredDate = hiredDate;
                return this;
            }

            /**
             * identities.
             */
            public Builder identities(Identities identities) {
                this.identities = identities;
                return this;
            }

            /**
             * joinTime.
             */
            public Builder joinTime(Long joinTime) {
                this.joinTime = joinTime;
                return this;
            }

            /**
             * lastVisitTime.
             */
            public Builder lastVisitTime(Long lastVisitTime) {
                this.lastVisitTime = lastVisitTime;
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
             * organizationMemberName.
             */
            public Builder organizationMemberName(String organizationMemberName) {
                this.organizationMemberName = organizationMemberName;
                return this;
            }

            /**
             * organizationRoleId.
             */
            public Builder organizationRoleId(String organizationRoleId) {
                this.organizationRoleId = organizationRoleId;
                return this;
            }

            /**
             * organizationRoleName.
             */
            public Builder organizationRoleName(String organizationRoleName) {
                this.organizationRoleName = organizationRoleName;
                return this;
            }

            /**
             * state.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Member build() {
                return new Member(this);
            } 

        } 

    }
}
