/**
 * Created by seva on 6/16/17.
 */

(function () {

    var app=angular.module("MyApp");

    app.controller("StdDataCtr",studentDataCtr);

   function studentDataCtr(DataService) {
       var self = this;



       self.getContacts=function () {
           DataService.getContacts()
               .then(function (data) {
                   self.contacts = data;
               });
       };
       self.getContacts();
       self.saveSelected=function () {
    //console.log( self.contacts);
           DataService.saveUser({id:this.first,
               name:this.first,
                           surname:this.last}).then(function () {
               self.successMessage="Data successfully updated";
               self.getContacts();
               self.first='';
               self.last='';
           },function () {
               self.errorMessage="Error Occurred ";
           });
       };



   }

})();