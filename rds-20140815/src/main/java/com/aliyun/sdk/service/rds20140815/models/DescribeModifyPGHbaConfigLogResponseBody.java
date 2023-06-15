// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeModifyPGHbaConfigLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeModifyPGHbaConfigLogResponseBody</p>
 */
public class DescribeModifyPGHbaConfigLogResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @NameInMap("HbaLogItems")
    private HbaLogItems hbaLogItems;

    @NameInMap("LogItemCount")
    private Integer logItemCount;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeModifyPGHbaConfigLogResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.hbaLogItems = builder.hbaLogItems;
        this.logItemCount = builder.logItemCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeModifyPGHbaConfigLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return hbaLogItems
     */
    public HbaLogItems getHbaLogItems() {
        return this.hbaLogItems;
    }

    /**
     * @return logItemCount
     */
    public Integer getLogItemCount() {
        return this.logItemCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private HbaLogItems hbaLogItems; 
        private Integer logItemCount; 
        private String requestId; 

        /**
         * The ID of the instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * An array that consists of the modifications to the pg_hba.conf file.
         */
        public Builder hbaLogItems(HbaLogItems hbaLogItems) {
            this.hbaLogItems = hbaLogItems;
            return this;
        }

        /**
         * The number of modification records.
         */
        public Builder logItemCount(Integer logItemCount) {
            this.logItemCount = logItemCount;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeModifyPGHbaConfigLogResponseBody build() {
            return new DescribeModifyPGHbaConfigLogResponseBody(this);
        } 

    } 

    public static class HbaItem extends TeaModel {
        @NameInMap("Address")
        private String address;

        @NameInMap("Database")
        private String database;

        @NameInMap("Mask")
        private String mask;

        @NameInMap("Method")
        private String method;

        @NameInMap("Option")
        private String option;

        @NameInMap("PriorityId")
        private Integer priorityId;

        @NameInMap("Type")
        private String type;

        @NameInMap("User")
        private String user;

        private HbaItem(Builder builder) {
            this.address = builder.address;
            this.database = builder.database;
            this.mask = builder.mask;
            this.method = builder.method;
            this.option = builder.option;
            this.priorityId = builder.priorityId;
            this.type = builder.type;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HbaItem create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return mask
         */
        public String getMask() {
            return this.mask;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return option
         */
        public String getOption() {
            return this.option;
        }

        /**
         * @return priorityId
         */
        public Integer getPriorityId() {
            return this.priorityId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String address; 
            private String database; 
            private String mask; 
            private String method; 
            private String option; 
            private Integer priorityId; 
            private String type; 
            private String user; 

            /**
             * The IP address of the instance.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * The mask of the instance.
             */
            public Builder mask(String mask) {
                this.mask = mask;
                return this;
            }

            /**
             * The authentication method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * The value of this parameter was set based on the value of the Method parameter.
             */
            public Builder option(String option) {
                this.option = option;
                return this;
            }

            /**
             * The priority of the configuration item in the pg_hba.conf file.
             */
            public Builder priorityId(Integer priorityId) {
                this.priorityId = priorityId;
                return this;
            }

            /**
             * The type of the connection.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The username of the account that was used to connect to the instance.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public HbaItem build() {
                return new HbaItem(this);
            } 

        } 

    }
    public static class AfterHbaItems extends TeaModel {
        @NameInMap("HbaItem")
        private java.util.List < HbaItem> hbaItem;

        private AfterHbaItems(Builder builder) {
            this.hbaItem = builder.hbaItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AfterHbaItems create() {
            return builder().build();
        }

        /**
         * @return hbaItem
         */
        public java.util.List < HbaItem> getHbaItem() {
            return this.hbaItem;
        }

        public static final class Builder {
            private java.util.List < HbaItem> hbaItem; 

            /**
             * HbaItem.
             */
            public Builder hbaItem(java.util.List < HbaItem> hbaItem) {
                this.hbaItem = hbaItem;
                return this;
            }

            public AfterHbaItems build() {
                return new AfterHbaItems(this);
            } 

        } 

    }
    public static class BeforeHbaItemsHbaItem extends TeaModel {
        @NameInMap("Address")
        private String address;

        @NameInMap("Database")
        private String database;

        @NameInMap("Mask")
        private String mask;

        @NameInMap("Method")
        private String method;

        @NameInMap("Option")
        private String option;

        @NameInMap("PriorityId")
        private Integer priorityId;

        @NameInMap("Type")
        private String type;

        @NameInMap("User")
        private String user;

        private BeforeHbaItemsHbaItem(Builder builder) {
            this.address = builder.address;
            this.database = builder.database;
            this.mask = builder.mask;
            this.method = builder.method;
            this.option = builder.option;
            this.priorityId = builder.priorityId;
            this.type = builder.type;
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BeforeHbaItemsHbaItem create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return mask
         */
        public String getMask() {
            return this.mask;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return option
         */
        public String getOption() {
            return this.option;
        }

        /**
         * @return priorityId
         */
        public Integer getPriorityId() {
            return this.priorityId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        public static final class Builder {
            private String address; 
            private String database; 
            private String mask; 
            private String method; 
            private String option; 
            private Integer priorityId; 
            private String type; 
            private String user; 

            /**
             * The IP address of the instance.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * The mask of the instance.
             */
            public Builder mask(String mask) {
                this.mask = mask;
                return this;
            }

            /**
             * The authentication method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * The value of this parameter was set based on the value of the Method parameter.
             */
            public Builder option(String option) {
                this.option = option;
                return this;
            }

            /**
             * The priority of the configuration item in the pg_hba.conf file.
             */
            public Builder priorityId(Integer priorityId) {
                this.priorityId = priorityId;
                return this;
            }

            /**
             * The type of the connection.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The username of the account that was used to connect to the instance.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public BeforeHbaItemsHbaItem build() {
                return new BeforeHbaItemsHbaItem(this);
            } 

        } 

    }
    public static class BeforeHbaItems extends TeaModel {
        @NameInMap("HbaItem")
        private java.util.List < BeforeHbaItemsHbaItem> hbaItem;

        private BeforeHbaItems(Builder builder) {
            this.hbaItem = builder.hbaItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BeforeHbaItems create() {
            return builder().build();
        }

        /**
         * @return hbaItem
         */
        public java.util.List < BeforeHbaItemsHbaItem> getHbaItem() {
            return this.hbaItem;
        }

        public static final class Builder {
            private java.util.List < BeforeHbaItemsHbaItem> hbaItem; 

            /**
             * HbaItem.
             */
            public Builder hbaItem(java.util.List < BeforeHbaItemsHbaItem> hbaItem) {
                this.hbaItem = hbaItem;
                return this;
            }

            public BeforeHbaItems build() {
                return new BeforeHbaItems(this);
            } 

        } 

    }
    public static class HbaLogItem extends TeaModel {
        @NameInMap("AfterHbaItems")
        private AfterHbaItems afterHbaItems;

        @NameInMap("BeforeHbaItems")
        private BeforeHbaItems beforeHbaItems;

        @NameInMap("ModifyStatus")
        private String modifyStatus;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("StatusReason")
        private String statusReason;

        private HbaLogItem(Builder builder) {
            this.afterHbaItems = builder.afterHbaItems;
            this.beforeHbaItems = builder.beforeHbaItems;
            this.modifyStatus = builder.modifyStatus;
            this.modifyTime = builder.modifyTime;
            this.statusReason = builder.statusReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HbaLogItem create() {
            return builder().build();
        }

        /**
         * @return afterHbaItems
         */
        public AfterHbaItems getAfterHbaItems() {
            return this.afterHbaItems;
        }

        /**
         * @return beforeHbaItems
         */
        public BeforeHbaItems getBeforeHbaItems() {
            return this.beforeHbaItems;
        }

        /**
         * @return modifyStatus
         */
        public String getModifyStatus() {
            return this.modifyStatus;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return statusReason
         */
        public String getStatusReason() {
            return this.statusReason;
        }

        public static final class Builder {
            private AfterHbaItems afterHbaItems; 
            private BeforeHbaItems beforeHbaItems; 
            private String modifyStatus; 
            private String modifyTime; 
            private String statusReason; 

            /**
             * The configuration of the pg_hba.conf file after the modification was made.
             */
            public Builder afterHbaItems(AfterHbaItems afterHbaItems) {
                this.afterHbaItems = afterHbaItems;
                return this;
            }

            /**
             * The configuration of the pg_hba.conf file before the modification was made.
             */
            public Builder beforeHbaItems(BeforeHbaItems beforeHbaItems) {
                this.beforeHbaItems = beforeHbaItems;
                return this;
            }

            /**
             * The status of the modification.
             * <p>
             * 
             * *   **success**: The modification is successful.
             * *   **failed**: The modification failed.
             * *   **setting**: The modification is being applied.
             */
            public Builder modifyStatus(String modifyStatus) {
                this.modifyStatus = modifyStatus;
                return this;
            }

            /**
             * The time when the pg_hba.conf file was modified. The time is displayed in UTC.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * The reason why the modification failed.
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            public HbaLogItem build() {
                return new HbaLogItem(this);
            } 

        } 

    }
    public static class HbaLogItems extends TeaModel {
        @NameInMap("HbaLogItem")
        private java.util.List < HbaLogItem> hbaLogItem;

        private HbaLogItems(Builder builder) {
            this.hbaLogItem = builder.hbaLogItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HbaLogItems create() {
            return builder().build();
        }

        /**
         * @return hbaLogItem
         */
        public java.util.List < HbaLogItem> getHbaLogItem() {
            return this.hbaLogItem;
        }

        public static final class Builder {
            private java.util.List < HbaLogItem> hbaLogItem; 

            /**
             * HbaLogItem.
             */
            public Builder hbaLogItem(java.util.List < HbaLogItem> hbaLogItem) {
                this.hbaLogItem = hbaLogItem;
                return this;
            }

            public HbaLogItems build() {
                return new HbaLogItems(this);
            } 

        } 

    }
}
