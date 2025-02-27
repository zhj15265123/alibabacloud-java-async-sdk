// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPhysicalDatabaseResponseBody} extends {@link TeaModel}
 *
 * <p>GetPhysicalDatabaseResponseBody</p>
 */
public class GetPhysicalDatabaseResponseBody extends TeaModel {
    @NameInMap("Database")
    private Database database;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetPhysicalDatabaseResponseBody(Builder builder) {
        this.database = builder.database;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPhysicalDatabaseResponseBody create() {
        return builder().build();
    }

    /**
     * @return database
     */
    public Database getDatabase() {
        return this.database;
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
        private Database database; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * The information about the physical database.
         */
        public Builder database(Database database) {
            this.database = database;
            return this;
        }

        /**
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetPhysicalDatabaseResponseBody build() {
            return new GetPhysicalDatabaseResponseBody(this);
        } 

    } 

    public static class OwnerIdList extends TeaModel {
        @NameInMap("OwnerIds")
        private java.util.List < String > ownerIds;

        private OwnerIdList(Builder builder) {
            this.ownerIds = builder.ownerIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OwnerIdList create() {
            return builder().build();
        }

        /**
         * @return ownerIds
         */
        public java.util.List < String > getOwnerIds() {
            return this.ownerIds;
        }

        public static final class Builder {
            private java.util.List < String > ownerIds; 

            /**
             * OwnerIds.
             */
            public Builder ownerIds(java.util.List < String > ownerIds) {
                this.ownerIds = ownerIds;
                return this;
            }

            public OwnerIdList build() {
                return new OwnerIdList(this);
            } 

        } 

    }
    public static class OwnerNameList extends TeaModel {
        @NameInMap("OwnerNames")
        private java.util.List < String > ownerNames;

        private OwnerNameList(Builder builder) {
            this.ownerNames = builder.ownerNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OwnerNameList create() {
            return builder().build();
        }

        /**
         * @return ownerNames
         */
        public java.util.List < String > getOwnerNames() {
            return this.ownerNames;
        }

        public static final class Builder {
            private java.util.List < String > ownerNames; 

            /**
             * OwnerNames.
             */
            public Builder ownerNames(java.util.List < String > ownerNames) {
                this.ownerNames = ownerNames;
                return this;
            }

            public OwnerNameList build() {
                return new OwnerNameList(this);
            } 

        } 

    }
    public static class Database extends TeaModel {
        @NameInMap("CatalogName")
        private String catalogName;

        @NameInMap("DatabaseId")
        private String databaseId;

        @NameInMap("DbType")
        private String dbType;

        @NameInMap("DbaId")
        private String dbaId;

        @NameInMap("DbaName")
        private String dbaName;

        @NameInMap("Encoding")
        private String encoding;

        @NameInMap("EnvType")
        private String envType;

        @NameInMap("Host")
        private String host;

        @NameInMap("InstanceAlias")
        private String instanceAlias;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("OwnerIdList")
        private OwnerIdList ownerIdList;

        @NameInMap("OwnerNameList")
        private OwnerNameList ownerNameList;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("SchemaName")
        private String schemaName;

        @NameInMap("SearchName")
        private String searchName;

        @NameInMap("Sid")
        private String sid;

        @NameInMap("State")
        private String state;

        private Database(Builder builder) {
            this.catalogName = builder.catalogName;
            this.databaseId = builder.databaseId;
            this.dbType = builder.dbType;
            this.dbaId = builder.dbaId;
            this.dbaName = builder.dbaName;
            this.encoding = builder.encoding;
            this.envType = builder.envType;
            this.host = builder.host;
            this.instanceAlias = builder.instanceAlias;
            this.instanceId = builder.instanceId;
            this.ownerIdList = builder.ownerIdList;
            this.ownerNameList = builder.ownerNameList;
            this.port = builder.port;
            this.schemaName = builder.schemaName;
            this.searchName = builder.searchName;
            this.sid = builder.sid;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Database create() {
            return builder().build();
        }

        /**
         * @return catalogName
         */
        public String getCatalogName() {
            return this.catalogName;
        }

        /**
         * @return databaseId
         */
        public String getDatabaseId() {
            return this.databaseId;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return dbaId
         */
        public String getDbaId() {
            return this.dbaId;
        }

        /**
         * @return dbaName
         */
        public String getDbaName() {
            return this.dbaName;
        }

        /**
         * @return encoding
         */
        public String getEncoding() {
            return this.encoding;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return instanceAlias
         */
        public String getInstanceAlias() {
            return this.instanceAlias;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ownerIdList
         */
        public OwnerIdList getOwnerIdList() {
            return this.ownerIdList;
        }

        /**
         * @return ownerNameList
         */
        public OwnerNameList getOwnerNameList() {
            return this.ownerNameList;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        /**
         * @return searchName
         */
        public String getSearchName() {
            return this.searchName;
        }

        /**
         * @return sid
         */
        public String getSid() {
            return this.sid;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String catalogName; 
            private String databaseId; 
            private String dbType; 
            private String dbaId; 
            private String dbaName; 
            private String encoding; 
            private String envType; 
            private String host; 
            private String instanceAlias; 
            private String instanceId; 
            private OwnerIdList ownerIdList; 
            private OwnerNameList ownerNameList; 
            private Integer port; 
            private String schemaName; 
            private String searchName; 
            private String sid; 
            private String state; 

            /**
             * The name of the catalog to which the database belongs.
             * <p>
             * 
             * > : If the database is a PostgreSQL database, the name of the database is displayed.
             */
            public Builder catalogName(String catalogName) {
                this.catalogName = catalogName;
                return this;
            }

            /**
             * The ID of the physical database.
             */
            public Builder databaseId(String databaseId) {
                this.databaseId = databaseId;
                return this;
            }

            /**
             * The type of the database engine.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * The user ID of the DBA in the destination database.
             */
            public Builder dbaId(String dbaId) {
                this.dbaId = dbaId;
                return this;
            }

            /**
             * The nickname of the database administrator (DBA) in the destination database.
             */
            public Builder dbaName(String dbaName) {
                this.dbaName = dbaName;
                return this;
            }

            /**
             * The encoding format of the database.
             */
            public Builder encoding(String encoding) {
                this.encoding = encoding;
                return this;
            }

            /**
             * The type of the environment to which the database belongs. For more information, see [Change the environment type of an instance](~~163309~~).
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * The endpoint that is used to connect to the database.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * InstanceAlias.
             */
            public Builder instanceAlias(String instanceAlias) {
                this.instanceAlias = instanceAlias;
                return this;
            }

            /**
             * The instance ID of the destination database.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The user IDs of the database owners.
             */
            public Builder ownerIdList(OwnerIdList ownerIdList) {
                this.ownerIdList = ownerIdList;
                return this;
            }

            /**
             * The nicknames of the database owners.
             */
            public Builder ownerNameList(OwnerNameList ownerNameList) {
                this.ownerNameList = ownerNameList;
                return this;
            }

            /**
             * The port that is used to connect to the database.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The name of the database.
             * <p>
             * 
             * > : If the database is a PostgreSQL database, the name of the mode is displayed.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * The name that is used for searching the database.
             */
            public Builder searchName(String searchName) {
                this.searchName = searchName;
                return this;
            }

            /**
             * The system ID (SID) of the database.
             * <p>
             * 
             * > : The value of the parameter is returned only for Oracle databases.
             */
            public Builder sid(String sid) {
                this.sid = sid;
                return this;
            }

            /**
             * The state of the database. Valid values:
             * <p>
             * 
             * *   **NORMAL**: The database is normal.
             * *   **DISABLE**: The database is disabled.
             * *   **OFFLINE**: The database is unpublished.
             * *   **NOT_EXIST**: The database does not exist.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Database build() {
                return new Database(this);
            } 

        } 

    }
}
