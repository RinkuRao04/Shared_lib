def call(Map config) {
// checkout scmGit(branches: [[name: config.branch]], extensions: [], userRemoteConfigs: [[config.url]])
   checkout scmGit(branches: [[name: config.branch]], extensions: [], userRemoteConfigs: [[url: config.url]])
}
