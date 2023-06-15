// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePGHbaConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePGHbaConfigResponseBody</p>
 */
public class DescribePGHbaConfigResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @NameInMap("DefaultHbaItems")
    private DefaultHbaItems defaultHbaItems;

    @NameInMap("HbaModifyTime")
    private String hbaModifyTime;

    @NameInMap("LastModifyStatus")
    private String lastModifyStatus;

    @NameInMap("ModifyStatusReason")
    private String modifyStatusReason;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RunningHbaItems")
    private RunningHbaItems runningHbaItems;

    private DescribePGHbaConfigResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.defaultHbaItems = builder.defaultHbaItems;
        this.hbaModifyTime = builder.hbaModifyTime;
        this.lastModifyStatus = builder.lastModifyStatus;
        this.modifyStatusReason = builder.modifyStatusReason;
        this.requestId = builder.requestId;
        this.runningHbaItems = builder.runningHbaItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePGHbaConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return defaultHbaItems
     */
    public DefaultHbaItems getDefaultHbaItems() {
        return this.defaultHbaItems;
    }

    /**
     * @return hbaModifyTime
     */
    public String getHbaModifyTime() {
        return this.hbaModifyTime;
    }

    /**
     * @return lastModifyStatus
     */
    public String getLastModifyStatus() {
        return this.lastModifyStatus;
    }

    /**
     * @return modifyStatusReason
     */
    public String getModifyStatusReason() {
        return this.modifyStatusReason;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return runningHbaItems
     */
    public RunningHbaItems getRunningHbaItems() {
        return this.runningHbaItems;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private DefaultHbaItems defaultHbaItems; 
        private String hbaModifyTime; 
        private String lastModifyStatus; 
        private String modifyStatusReason; 
        private String requestId; 
        private RunningHbaItems runningHbaItems; 

        /**
         * The ID of the instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * An array that consists of the default configuration items in the pg_hba.conf file.
         */
        public Builder defaultHbaItems(DefaultHbaItems defaultHbaItems) {
            this.defaultHbaItems = defaultHbaItems;
            return this;
        }

        /**
         * The time when the previous modification was made to the pg_hba.conf file.
         */
        public Builder hbaModifyTime(String hbaModifyTime) {
            this.hbaModifyTime = hbaModifyTime;
            return this;
        }

        /**
         * The status of the previous modification to the pg_hba.conf file.
         * <p>
         * 
         * Valid values:
         * 
         * *   **success**: The modification is successful.
         * *   **setting**: The modification is being applied.
         * *   **failed**: The modification fails.
         */
        public Builder lastModifyStatus(String lastModifyStatus) {
            this.lastModifyStatus = lastModifyStatus;
            return this;
        }

        /**
         * The reason why the previous modification was made to the pg_hba.conf file.
         */
        public Builder modifyStatusReason(String modifyStatusReason) {
            this.modifyStatusReason = modifyStatusReason;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array that consists of the current configuration items in the pg_hba.conf file.
         */
        public Builder runningHbaItems(RunningHbaItems runningHbaItems) {
            this.runningHbaItems = runningHbaItems;
            return this;
        }

        public DescribePGHbaConfigResponseBody build() {
            return new DescribePGHbaConfigResponseBody(this);
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
             * The IP addresses from which the specified users can access the specified databases. The value is fixed as 0.0.0.0/0.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * The names of the databases that the specified users are allowed to access. The value is fixed as all or replication.
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * The mask of the instance. The value is fixed as null.
             */
            public Builder mask(String mask) {
                this.mask = mask;
                return this;
            }

            /**
             * The authentication method. The value is fixed as md5.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * The value of this parameter is based on the value of the Method parameter. The value is fixed as null.
             */
            public Builder option(String option) {
                this.option = option;
                return this;
            }

            /**
             * The priority of the configuration items in the pg_hba.conf file. This value is automatically generated.
             */
            public Builder priorityId(Integer priorityId) {
                this.priorityId = priorityId;
                return this;
            }

            /**
             * The type of connection to the instance. The value is fixed as host.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The user that is allowed to access the instance. The value is fixed as all.
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
    public static class DefaultHbaItems extends TeaModel {
        @NameInMap("HbaItem")
        private java.util.List < HbaItem> hbaItem;

        private DefaultHbaItems(Builder builder) {
            this.hbaItem = builder.hbaItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultHbaItems create() {
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

            public DefaultHbaItems build() {
                return new DefaultHbaItems(this);
            } 

        } 

    }
    public static class RunningHbaItemsHbaItem extends TeaModel {
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

        private RunningHbaItemsHbaItem(Builder builder) {
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

        public static RunningHbaItemsHbaItem create() {
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
             * The IP address of the client.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * The name of the database that the specified users are allowed to access.
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
             * The value of this parameter varies based on the value of the Method parameter. The value is fixed as null.
             */
            public Builder option(String option) {
                this.option = option;
                return this;
            }

            /**
             * The priority of the instance.
             */
            public Builder priorityId(Integer priorityId) {
                this.priorityId = priorityId;
                return this;
            }

            /**
             * The type of the connection. 
             * <p>
             * 
             * - **host**: The record matches TCP/IP connections, including SSL connections and non-SSL connections.
             * - **hostssl**: The record matches only TCP/IP connections that are established over SSL.
             * - **hostnossl**: The record matches only TCP/IP connections that are not established over SSL.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The username of the account that is used to connect to the instance.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            public RunningHbaItemsHbaItem build() {
                return new RunningHbaItemsHbaItem(this);
            } 

        } 

    }
    public static class RunningHbaItems extends TeaModel {
        @NameInMap("HbaItem")
        private java.util.List < RunningHbaItemsHbaItem> hbaItem;

        private RunningHbaItems(Builder builder) {
            this.hbaItem = builder.hbaItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RunningHbaItems create() {
            return builder().build();
        }

        /**
         * @return hbaItem
         */
        public java.util.List < RunningHbaItemsHbaItem> getHbaItem() {
            return this.hbaItem;
        }

        public static final class Builder {
            private java.util.List < RunningHbaItemsHbaItem> hbaItem; 

            /**
             * HbaItem.
             */
            public Builder hbaItem(java.util.List < RunningHbaItemsHbaItem> hbaItem) {
                this.hbaItem = hbaItem;
                return this;
            }

            public RunningHbaItems build() {
                return new RunningHbaItems(this);
            } 

        } 

    }
}
