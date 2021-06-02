import React,{useState} from "react";
import Axios from "axios";

function Table({students}) {


    return (
        <table>
            <thead>
                <th> Reg.No </th>
                <th> Name </th>
                <th> DOB </th>
                <th> Class </th>
                <th> Division </th>
                <th> Gender </th>
            </thead>

            {students.map((student, i) => {
                const {rno, name, dob, classz, division, gender} = student;
                return (
                    <tr>
                        <td> {rno} </td>
                        <td> {name} </td>
                        <td> {dob} </td>
                        <td> {classz} </td>
                        <td> {division} </td>
                        <td> {gender} </td>
                    </tr>
                )
            })}

        </table>

    )
}
export default Table;