// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageSensitiveFileByKeyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageSensitiveFileByKeyResponseBody</p>
 */
public class DescribeImageSensitiveFileByKeyResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SensitiveFileList")
    private java.util.List < SensitiveFileList> sensitiveFileList;

    @NameInMap("Success")
    private Boolean success;

    private DescribeImageSensitiveFileByKeyResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.sensitiveFileList = builder.sensitiveFileList;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageSensitiveFileByKeyResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sensitiveFileList
     */
    public java.util.List < SensitiveFileList> getSensitiveFileList() {
        return this.sensitiveFileList;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private PageInfo pageInfo; 
        private String requestId; 
        private java.util.List < SensitiveFileList> sensitiveFileList; 
        private Boolean success; 

        /**
         * The status code returned. If the 200 status code is returned, the request was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the sensitive files.
         */
        public Builder sensitiveFileList(java.util.List < SensitiveFileList> sensitiveFileList) {
            this.sensitiveFileList = sensitiveFileList;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeImageSensitiveFileByKeyResponseBody build() {
            return new DescribeImageSensitiveFileByKeyResponseBody(this);
        } 

    } 

    public static class PageInfo extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("LastRowKey")
        private String lastRowKey;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.lastRowKey = builder.lastRowKey;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return lastRowKey
         */
        public String getLastRowKey() {
            return this.lastRowKey;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private String lastRowKey; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The number of entries returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The key of the last data entry.
             */
            public Builder lastRowKey(String lastRowKey) {
                this.lastRowKey = lastRowKey;
                return this;
            }

            /**
             * The number of entries returned per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    public static class SensitiveFileList extends TeaModel {
        @NameInMap("Advice")
        private String advice;

        @NameInMap("Description")
        private String description;

        @NameInMap("FilePath")
        private String filePath;

        @NameInMap("FirstScanTime")
        private Long firstScanTime;

        @NameInMap("LastScanTime")
        private Long lastScanTime;

        @NameInMap("LayerDigest")
        private String layerDigest;

        @NameInMap("Md5")
        private String md5;

        @NameInMap("Promt")
        private String promt;

        @NameInMap("RiskLevel")
        private String riskLevel;

        @NameInMap("SensitiveFileKey")
        private String sensitiveFileKey;

        @NameInMap("SensitiveFileName")
        private String sensitiveFileName;

        private SensitiveFileList(Builder builder) {
            this.advice = builder.advice;
            this.description = builder.description;
            this.filePath = builder.filePath;
            this.firstScanTime = builder.firstScanTime;
            this.lastScanTime = builder.lastScanTime;
            this.layerDigest = builder.layerDigest;
            this.md5 = builder.md5;
            this.promt = builder.promt;
            this.riskLevel = builder.riskLevel;
            this.sensitiveFileKey = builder.sensitiveFileKey;
            this.sensitiveFileName = builder.sensitiveFileName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveFileList create() {
            return builder().build();
        }

        /**
         * @return advice
         */
        public String getAdvice() {
            return this.advice;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return filePath
         */
        public String getFilePath() {
            return this.filePath;
        }

        /**
         * @return firstScanTime
         */
        public Long getFirstScanTime() {
            return this.firstScanTime;
        }

        /**
         * @return lastScanTime
         */
        public Long getLastScanTime() {
            return this.lastScanTime;
        }

        /**
         * @return layerDigest
         */
        public String getLayerDigest() {
            return this.layerDigest;
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        /**
         * @return promt
         */
        public String getPromt() {
            return this.promt;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return sensitiveFileKey
         */
        public String getSensitiveFileKey() {
            return this.sensitiveFileKey;
        }

        /**
         * @return sensitiveFileName
         */
        public String getSensitiveFileName() {
            return this.sensitiveFileName;
        }

        public static final class Builder {
            private String advice; 
            private String description; 
            private String filePath; 
            private Long firstScanTime; 
            private Long lastScanTime; 
            private String layerDigest; 
            private String md5; 
            private String promt; 
            private String riskLevel; 
            private String sensitiveFileKey; 
            private String sensitiveFileName; 

            /**
             * The suggestion.
             */
            public Builder advice(String advice) {
                this.advice = advice;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The file path.
             */
            public Builder filePath(String filePath) {
                this.filePath = filePath;
                return this;
            }

            /**
             * The timestamp generated when the first scan was performed. Unit: milliseconds.
             */
            public Builder firstScanTime(Long firstScanTime) {
                this.firstScanTime = firstScanTime;
                return this;
            }

            /**
             * The timestamp generated when the last baseline check was performed. Unit: milliseconds.
             */
            public Builder lastScanTime(Long lastScanTime) {
                this.lastScanTime = lastScanTime;
                return this;
            }

            /**
             * The digest of the image layer.
             */
            public Builder layerDigest(String layerDigest) {
                this.layerDigest = layerDigest;
                return this;
            }

            /**
             * Md5.
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * The sensitive content.
             */
            public Builder promt(String promt) {
                this.promt = promt;
                return this;
            }

            /**
             * The risk level. Valid values:
             * <p>
             * 
             * *   **high**
             * *   **medium**
             * *   **low**
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * The type of alerts for the sensitive files. Valid values:
             * <p>
             * 
             * *   **npm_token**: NPM access token
             * *   **ftp_cfg**: FTP configuration
             * *   **google_oauth_key**: Google OAuth key
             * *   **planetscale_passwd**: PlanetScale password
             * *   **github_ssh_key** :Github SSH key
             * *   **msbuild_publish_profile**: MSBuild publish profile
             * *   **fastly_cdn_token**: Fastly CDN token
             * *   **ssh_private_key**: SSH private key
             * *   **aws_cli**: AWS CLI credentials
             * *   **cpanel_proftpd**: cPanel ProFTPD credentials
             * *   **postgresql_passwd**: PostgreSQL password file
             * *   **discord_client_cred**: Discord client credentials
             * *   **rails_database**: Rails database configuration
             * *   **aws_access_key**: AWS access key
             * *   **esmtp_cfg**: ESMTP configuration
             * *   **docker_registry_cfg**: configuration of a Docker image repository
             * *   **pem**: PEM
             * *   **common_cred**: common credential
             * *   **sftp_cfg**: SFTP connection configuration
             * *   **grafana_token**: Grafana token
             * *   **slack_token**: Slack token
             * *   **ec_private_key**: EC private key
             * *   **pypi_token**: upload token for the PyPI
             * *   **finicity_token**: Finicity token
             * *   **k8s_client_key**: Kubernetes private key
             * *   **git_cfg**: Git configuration
             * *   **django_key**: Django key
             * *   **jenkins_ssh**: Jenkins SSH configuration file
             * *   **openssh_private_key**: OpenSSL private key
             * *   **square_oauth**: OAuth credential for Square
             * *   **typeform_token**: Typeform token
             * *   **common_database_cfg**: general database connection configuration
             * *   **wordpress_database_cfg**: WordPress database configuration
             * *   **googlecloud_api_key**: API key for Google Cloud
             * *   **vscode_sftp**: VSCode SFTP configuration
             * *   **apache_htpasswd**: Apache htpasswd
             * *   **planetscale_token**: PlanetScale token
             * *   **contentful_preview_token**: preview token for Contentful
             * *   **php_database_cfg**: database password for a PHP application
             * *   **atom_remote_sync**: Atom remote synchronization configuration
             * *   **aws_session_token**: AWS session token
             * *   **atom_sftp_cfg**: Atom SFTP configuration
             * *   **asana_client_private_key** :Asana client key
             * *   **tencentcloud_ak**: secret ID of a third-party cloud
             * *   **rsa_private_key**: RSA private key
             * *   **github_personal_token**: personal access token for GitHub
             * *   **pgp**: PGP encrypted file
             * *   **stripe_skpk**: Stripe secret key
             * *   **square_token**: Square access token
             * *   **rails_carrierwave**: Rails Carrierwave credential
             * *   **dbeaver_database_cfg**: DBeaver database configuration
             * *   **robomongo_cred**: credential for RoboMongo
             * *   **github_oauth_token**: OAuth access token for GitHub
             * *   **pulumi_token**: Pulumi token
             * *   **ventrilo_voip**: configuration of a Ventrilo VoIP server
             * *   **macos_keychain**: macOS keychain
             * *   **amazon_mws_token**: Amazon MWS token
             * *   **dynatrace_token**: Dynatrace token
             * *   **java_keystore**: JKS
             * *   **microsoft_sdf**: Microsoft SQL Server CE database
             * *   **kubernetes_dashboard_cred**: user credential for Kubernetes Dashboard
             * *   **atlassian_token**: Atlassian token
             * *   **rdp**: RDP
             * *   **mailgun_key**: Mailgun webhook signing key
             * *   **mailchimp_api_key**: API key for Mailchimp
             * *   **netrc_cfg**: .netrc configuration file
             * *   **openvpn_cfg**: OpenVPN configuration
             * *   **github_refresh_token**: GitHub refresh token
             * *   **salesforce**: Salesforce credentials
             * *   **salesforce**: Sendinblue credentials
             * *   **pkcs_private_key**: PKCS#12 key
             * *   **rubyonrails_passwd**: Ruby on Rails password file
             * *   **filezilla_ftp**: FileZilla FTP configuration
             * *   **databricks_token**: Databricks token
             * *   **gitLab_personal_toke**: personal access token for GitLab
             * *   **rails_master_key**: Rails master key
             * *   **sqlite**: SQLite3 or SQLite database
             * *   **firefox_logins**: Firefox logon configuration
             * *   **mailgun_private_token**: Mailgun private token
             * *   **joomla_cfg**: Joomla configuration
             * *   **hashicorp_terraform_token**: HashiCorp Terraform token
             * *   **jetbrains_ides**: JetBrains IDEs configuration
             * *   **heroku_api_key**: Heroku API key
             * *   **messagebird_token**: MessageBird token
             * *   **messagebird_token**: MessageBird token
             * *   **hashicorp_vault_token**: HashiCorp Vault token
             * *   **pgp_private_key**: PGP private key
             * *   **sshpasswd**: SSH password
             * *   **huaweicloud_ak**: secret access key of a third-party cloud
             * *   **aws_s3cmd**: AWS S3cmd configuration
             * *   **php_config**: PHP configuration
             * *   **common_private_key**: private key of a common type
             * *   **microsoft_mdf**: Microsoft SQL Server database
             * *   **mediawiki_cfg**: MediaWiki configuration
             * *   **jenkins_cred**: Jenkins credentials
             * *   **rubygems_cred**: RubyGems credentials
             * *   **clojars_token**: Clojars token
             * *   **phoenix_web_passwd**: Phoenix web credentials
             * *   **puttygen_private_key**: PuTTYgen private key
             * *   **google_oauth_token**: Google OAuth access token
             * *   **rubyonrails_cfg**: Ruby On Rails database configuration
             * *   **lob_api_key**: Lob API key
             * *   **pkcs_cred**: PKCS#12 certificate
             * *   **otr_private_key**: OTR private key
             * *   **contentful_delivery_token**: delivery token for Contentful
             * *   **digital_ocean_tugboat**: DigitalOcean Tugboat configuration
             * *   **dsa_private_key**: Digital DSA private key
             * *   **rails_app_token**: Rails app token
             * *   **git_cred**: Git user credentials
             * *   **newrelic_api_key**: User API key for New Relic
             * *   **github_hub**: hub configuration for storing GitHub tokens
             * *   **rubygem**: Rubygem Token
             */
            public Builder sensitiveFileKey(String sensitiveFileKey) {
                this.sensitiveFileKey = sensitiveFileKey;
                return this;
            }

            /**
             * The alert type name of the sensitive file.
             */
            public Builder sensitiveFileName(String sensitiveFileName) {
                this.sensitiveFileName = sensitiveFileName;
                return this;
            }

            public SensitiveFileList build() {
                return new SensitiveFileList(this);
            } 

        } 

    }
}
