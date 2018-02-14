import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { HttpModule } from '@angular/http';
import { FormsModule } from '@angular/forms'

import { AppRoutingModule } from './app.routing'
//import modulos
import { EmailModule } from './email/email.module'

// componentes

import { TiendaComponent } from './tienda/tienda.component';
import { ParquesComponent } from './parques/parques.component';
import { TableComponent } from './table/table.component';
import { AnimalsComponent } from './animals/animals.component';
import { ContactComponent } from './contact/contact.component';
import { HomeComponent } from './home/home.component';
import { KeepersComponent } from './keepers/keepers.component';
import { GuardarEmailComponent } from './modules/components/guardar-email/guardar-email.component';
import { MostrarEmailComponent } from './modules/components/mostrar-email/mostrar-email.component';
//import { routing } from './app.routing.ts';


@NgModule({
  declarations: [ // Directicas, componentes  y pipes
    AppComponent,
    TiendaComponent,
    ParquesComponent,
    TableComponent,
    AnimalsComponent,
    ContactComponent,
    HomeComponent,
    KeepersComponent,
    GuardarEmailComponent,
    MostrarEmailComponent
  ],
  imports: [ //
    BrowserModule,
    FormsModule,
    HttpModule,
    AppRoutingModule,
    EmailModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
