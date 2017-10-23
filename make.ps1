
$profile="local"

$currentPath = $pwd

if($args.length -gt 0) {
    $profile=$args[0]
}

Invoke-Expression -Command:"mvn -f pom.xml clean package -P$profile -U"

$projs=@("spring-erp-scala", "spring-erp-buyer", "spring-erp-vendor", "spring-erp-admin", "spring-erp-syslog4j-server")
foreach ($proj in $projs){
    $source=$PSScriptRoot + "/" + $proj + "/target/" + $proj + ".jar"
    $dest=$PSScriptRoot + "/bin/" + $proj + ".jar"
    copy $source $dest
}

cd $currentPath
