import React from 'react';
import Madegoal from './Madegoal';
import Missed from './Condition';


export default function Check(props){
const isgoal=props.isgoal

if(isgoal){
    return <Madegoal/>
}
else{
    return <Missed/>
}
}