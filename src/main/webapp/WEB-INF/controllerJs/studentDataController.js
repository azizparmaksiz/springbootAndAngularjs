/**
 * Created by seva on 6/16/17.
 */

(function () {

    var app=angular.module("MyApp");

    app.controller("StdDataCtr",studentDataCtr);

   function studentDataCtr(DataService) {
       var self = this;
       DataService.getContacts()
           .then(function (data) {
               self.contacts = data;
           });

       self.saveSelected=function () {

           DataService.saveUser({name:this.first,
                           surname:this.last}).then(function () {
               self.successMessage="Data successfully updated";
           },function () {
               self.errorMessage="Error Occurred ";
           });
       };



   }

})();