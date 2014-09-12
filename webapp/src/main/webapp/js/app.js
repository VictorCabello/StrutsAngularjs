var app = angular.module('deploy_test', []);

app.settings = {
    url : {
        user : {
            list : "list-user.action"
        }
    }
};

app.controller('UserController', function($scope, $http){
    
    var userListUrl = app.settings.url.user.list;
    var response = $http.get(userListUrl);
    
    response.success(function(data, status, headers, config) {
        console.log(data);
        $scope.list = data.list;
    });
});