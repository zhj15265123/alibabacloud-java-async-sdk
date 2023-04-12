// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMessageContactDeletionStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetMessageContactDeletionStatusResponseBody</p>
 */
public class GetMessageContactDeletionStatusResponseBody extends TeaModel {
    @NameInMap("ContactDeletionStatus")
    private ContactDeletionStatus contactDeletionStatus;

    @NameInMap("RequestId")
    private String requestId;

    private GetMessageContactDeletionStatusResponseBody(Builder builder) {
        this.contactDeletionStatus = builder.contactDeletionStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMessageContactDeletionStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return contactDeletionStatus
     */
    public ContactDeletionStatus getContactDeletionStatus() {
        return this.contactDeletionStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ContactDeletionStatus contactDeletionStatus; 
        private String requestId; 

        /**
         * ContactDeletionStatus.
         */
        public Builder contactDeletionStatus(ContactDeletionStatus contactDeletionStatus) {
            this.contactDeletionStatus = contactDeletionStatus;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMessageContactDeletionStatusResponseBody build() {
            return new GetMessageContactDeletionStatusResponseBody(this);
        } 

    } 

    public static class FailReasonList extends TeaModel {
        @NameInMap("AccountId")
        private String accountId;

        @NameInMap("MessageTypes")
        private java.util.List < String > messageTypes;

        private FailReasonList(Builder builder) {
            this.accountId = builder.accountId;
            this.messageTypes = builder.messageTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FailReasonList create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return messageTypes
         */
        public java.util.List < String > getMessageTypes() {
            return this.messageTypes;
        }

        public static final class Builder {
            private String accountId; 
            private java.util.List < String > messageTypes; 

            /**
             * AccountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * MessageTypes.
             */
            public Builder messageTypes(java.util.List < String > messageTypes) {
                this.messageTypes = messageTypes;
                return this;
            }

            public FailReasonList build() {
                return new FailReasonList(this);
            } 

        } 

    }
    public static class ContactDeletionStatus extends TeaModel {
        @NameInMap("ContactId")
        private String contactId;

        @NameInMap("FailReasonList")
        private java.util.List < FailReasonList> failReasonList;

        @NameInMap("Status")
        private String status;

        private ContactDeletionStatus(Builder builder) {
            this.contactId = builder.contactId;
            this.failReasonList = builder.failReasonList;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactDeletionStatus create() {
            return builder().build();
        }

        /**
         * @return contactId
         */
        public String getContactId() {
            return this.contactId;
        }

        /**
         * @return failReasonList
         */
        public java.util.List < FailReasonList> getFailReasonList() {
            return this.failReasonList;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String contactId; 
            private java.util.List < FailReasonList> failReasonList; 
            private String status; 

            /**
             * ContactId.
             */
            public Builder contactId(String contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * FailReasonList.
             */
            public Builder failReasonList(java.util.List < FailReasonList> failReasonList) {
                this.failReasonList = failReasonList;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ContactDeletionStatus build() {
                return new ContactDeletionStatus(this);
            } 

        } 

    }
}
