/**
 * Created by seva on 6/16/17.
 */
(function () {
    var app=angular.module("MyApp");

    app.service("DataService",dataService);

    function dataService($http) {
        var self=this;

        self.getContacts=function () {

            var promise1=$http.get('http://localhost:9090/students');

            var promise2=promise1.then(function (response) {

                return response.data;
            });
            return promise2
        };

        self.saveUser=function (userData) {

            return $http.post('http://localhost:9090/students/',userData)
                .then(function (response) {
                    console.log(response)
                });
        }
    }
})();