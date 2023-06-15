// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDatabasesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDatabasesResponseBody</p>
 */
public class DescribeDatabasesResponseBody extends TeaModel {
    @NameInMap("Databases")
    private Databases databases;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDatabasesResponseBody(Builder builder) {
        this.databases = builder.databases;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDatabasesResponseBody create() {
        return builder().build();
    }

    /**
     * @return databases
     */
    public Databases getDatabases() {
        return this.databases;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Databases databases; 
        private String requestId; 

        /**
         * An array that consists of the information about databases.
         */
        public Builder databases(Databases databases) {
            this.databases = databases;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDatabasesResponseBody build() {
            return new DescribeDatabasesResponseBody(this);
        } 

    } 

    public static class AccountPrivilegeInfo extends TeaModel {
        @NameInMap("Account")
        private String account;

        @NameInMap("AccountPrivilege")
        private String accountPrivilege;

        @NameInMap("AccountPrivilegeDetail")
        private String accountPrivilegeDetail;

        private AccountPrivilegeInfo(Builder builder) {
            this.account = builder.account;
            this.accountPrivilege = builder.accountPrivilege;
            this.accountPrivilegeDetail = builder.accountPrivilegeDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountPrivilegeInfo create() {
            return builder().build();
        }

        /**
         * @return account
         */
        public String getAccount() {
            return this.account;
        }

        /**
         * @return accountPrivilege
         */
        public String getAccountPrivilege() {
            return this.accountPrivilege;
        }

        /**
         * @return accountPrivilegeDetail
         */
        public String getAccountPrivilegeDetail() {
            return this.accountPrivilegeDetail;
        }

        public static final class Builder {
            private String account; 
            private String accountPrivilege; 
            private String accountPrivilegeDetail; 

            /**
             * The username of the account.
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

            /**
             * The permissions that the account has on the database. Valid values:
             * <p>
             * 
             * *   **ReadWrite**: read and write permissions
             * *   **ReadOnly**: read-only permissions
             * *   **DMLOnly**: DML-only permissions
             * *   **DDLOnly**: DDL-only permissions
             */
            public Builder accountPrivilege(String accountPrivilege) {
                this.accountPrivilege = accountPrivilege;
                return this;
            }

            /**
             * The details of the permissions that the account has on the database.
             */
            public Builder accountPrivilegeDetail(String accountPrivilegeDetail) {
                this.accountPrivilegeDetail = accountPrivilegeDetail;
                return this;
            }

            public AccountPrivilegeInfo build() {
                return new AccountPrivilegeInfo(this);
            } 

        } 

    }
    public static class Accounts extends TeaModel {
        @NameInMap("AccountPrivilegeInfo")
        private java.util.List < AccountPrivilegeInfo> accountPrivilegeInfo;

        private Accounts(Builder builder) {
            this.accountPrivilegeInfo = builder.accountPrivilegeInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Accounts create() {
            return builder().build();
        }

        /**
         * @return accountPrivilegeInfo
         */
        public java.util.List < AccountPrivilegeInfo> getAccountPrivilegeInfo() {
            return this.accountPrivilegeInfo;
        }

        public static final class Builder {
            private java.util.List < AccountPrivilegeInfo> accountPrivilegeInfo; 

            /**
             * AccountPrivilegeInfo.
             */
            public Builder accountPrivilegeInfo(java.util.List < AccountPrivilegeInfo> accountPrivilegeInfo) {
                this.accountPrivilegeInfo = accountPrivilegeInfo;
                return this;
            }

            public Accounts build() {
                return new Accounts(this);
            } 

        } 

    }
    public static class Database extends TeaModel {
        @NameInMap("Accounts")
        private Accounts accounts;

        @NameInMap("CharacterSetName")
        private String characterSetName;

        @NameInMap("Collate")
        private String collate;

        @NameInMap("ConnLimit")
        private String connLimit;

        @NameInMap("Ctype")
        private String ctype;

        @NameInMap("DBDescription")
        private String DBDescription;

        @NameInMap("DBInstanceId")
        private String DBInstanceId;

        @NameInMap("DBName")
        private String DBName;

        @NameInMap("DBStatus")
        private String DBStatus;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Tablespace")
        private String tablespace;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Database(Builder builder) {
            this.accounts = builder.accounts;
            this.characterSetName = builder.characterSetName;
            this.collate = builder.collate;
            this.connLimit = builder.connLimit;
            this.ctype = builder.ctype;
            this.DBDescription = builder.DBDescription;
            this.DBInstanceId = builder.DBInstanceId;
            this.DBName = builder.DBName;
            this.DBStatus = builder.DBStatus;
            this.engine = builder.engine;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.resourceGroupId = builder.resourceGroupId;
            this.tablespace = builder.tablespace;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Database create() {
            return builder().build();
        }

        /**
         * @return accounts
         */
        public Accounts getAccounts() {
            return this.accounts;
        }

        /**
         * @return characterSetName
         */
        public String getCharacterSetName() {
            return this.characterSetName;
        }

        /**
         * @return collate
         */
        public String getCollate() {
            return this.collate;
        }

        /**
         * @return connLimit
         */
        public String getConnLimit() {
            return this.connLimit;
        }

        /**
         * @return ctype
         */
        public String getCtype() {
            return this.ctype;
        }

        /**
         * @return DBDescription
         */
        public String getDBDescription() {
            return this.DBDescription;
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return DBName
         */
        public String getDBName() {
            return this.DBName;
        }

        /**
         * @return DBStatus
         */
        public String getDBStatus() {
            return this.DBStatus;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return tablespace
         */
        public String getTablespace() {
            return this.tablespace;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Accounts accounts; 
            private String characterSetName; 
            private String collate; 
            private String connLimit; 
            private String ctype; 
            private String DBDescription; 
            private String DBInstanceId; 
            private String DBName; 
            private String DBStatus; 
            private String engine; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private String resourceGroupId; 
            private String tablespace; 
            private Integer totalCount; 

            /**
             * An array that consists of the details of the accounts. Each account has specific permissions on the database.
             */
            public Builder accounts(Accounts accounts) {
                this.accounts = accounts;
                return this;
            }

            /**
             * The name of the character set.
             */
            public Builder characterSetName(String characterSetName) {
                this.characterSetName = characterSetName;
                return this;
            }

            /**
             * The collation of the character set. The example value C stands for localization.
             * <p>
             * 
             * >  This parameter is returned only for instances that run PostgreSQL.
             */
            public Builder collate(String collate) {
                this.collate = collate;
                return this;
            }

            /**
             * The limit on the number of concurrent requests. The value -1 indicates that the number of concurrent requests is unlimited.
             * <p>
             * 
             * >  This parameter is returned only for instances that run PostgreSQL.
             */
            public Builder connLimit(String connLimit) {
                this.connLimit = connLimit;
                return this;
            }

            /**
             * The type of the character set.
             * <p>
             * 
             * >  This parameter is returned only for instances that run PostgreSQL.
             */
            public Builder ctype(String ctype) {
                this.ctype = ctype;
                return this;
            }

            /**
             * The description of the database.
             */
            public Builder DBDescription(String DBDescription) {
                this.DBDescription = DBDescription;
                return this;
            }

            /**
             * The ID of the instance to which the database belongs.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder DBName(String DBName) {
                this.DBName = DBName;
                return this;
            }

            /**
             * The status of the database. Valid values:
             * <p>
             * 
             * *   **Creating**
             * *   **Running**
             * *   **Deleting**
             */
            public Builder DBStatus(String DBStatus) {
                this.DBStatus = DBStatus;
                return this;
            }

            /**
             * The database engine of the instance to which the database belongs.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The reserved parameter.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The tablespace of the database.
             * <p>
             * 
             * >  This parameter is returned only for instances that run PostgreSQL.
             */
            public Builder tablespace(String tablespace) {
                this.tablespace = tablespace;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Database build() {
                return new Database(this);
            } 

        } 

    }
    public static class Databases extends TeaModel {
        @NameInMap("Database")
        private java.util.List < Database> database;

        private Databases(Builder builder) {
            this.database = builder.database;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Databases create() {
            return builder().build();
        }

        /**
         * @return database
         */
        public java.util.List < Database> getDatabase() {
            return this.database;
        }

        public static final class Builder {
            private java.util.List < Database> database; 

            /**
             * Database.
             */
            public Builder database(java.util.List < Database> database) {
                this.database = database;
                return this;
            }

            public Databases build() {
                return new Databases(this);
            } 

        } 

    }
}
